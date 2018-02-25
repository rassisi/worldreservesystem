/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.hslf.usermodel;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ddf.AbstractEscherOptRecord;
import org.apache.poi.ddf.EscherArrayProperty;
import org.apache.poi.ddf.EscherContainerRecord;
import org.apache.poi.ddf.EscherOptRecord;
import org.apache.poi.ddf.EscherProperties;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.ddf.EscherSimpleProperty;
import org.apache.poi.ddf.EscherTextboxRecord;
import org.apache.poi.hslf.record.RecordTypes;
import org.apache.poi.sl.usermodel.ShapeContainer;
import org.apache.poi.sl.usermodel.TableShape;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.Units;

/**
 * Represents a table in a PowerPoint presentation
 *
 * @author Yegor Kozlov
 */
public final class HSLFTable extends HSLFGroupShape
implements HSLFShapeContainer, TableShape<HSLFShape,HSLFTextParagraph> {

    protected static final int BORDER_TOP = 1;
    protected static final int BORDER_RIGHT = 2;
    protected static final int BORDER_BOTTOM = 3;
    protected static final int BORDER_LEFT = 4;

    protected static final int BORDERS_ALL = 5;
    protected static final int BORDERS_OUTSIDE = 6;
    protected static final int BORDERS_INSIDE = 7;
    protected static final int BORDERS_NONE = 8;


    protected HSLFTableCell[][] cells;

    /**
     * Create a new Table of the given number of rows and columns
     *
     * @param numRows the number of rows
     * @param numCols the number of columns
     */
    public HSLFTable(int numRows, int numCols) {
        this(numRows, numCols, null);
    }
    
    /**
     * Create a new Table of the given number of rows and columns
     *
     * @param numRows the number of rows
     * @param numCols the number of columns
     * @param parent the parent shape, or null if table is added to sheet
     */
    public HSLFTable(int numRows, int numCols, ShapeContainer<HSLFShape,HSLFTextParagraph> parent) {
        super(parent);

        if(numRows < 1) throw new IllegalArgumentException("The number of rows must be greater than 1");
        if(numCols < 1) throw new IllegalArgumentException("The number of columns must be greater than 1");

        int x=0, y=0, tblWidth=0, tblHeight=0;
        cells = new HSLFTableCell[numRows][numCols];
        for (int i = 0; i < cells.length; i++) {
            x = 0;
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new HSLFTableCell(this);
                Rectangle anchor = new Rectangle(x, y, HSLFTableCell.DEFAULT_WIDTH, HSLFTableCell.DEFAULT_HEIGHT);
                cells[i][j].setAnchor(anchor);
                x += HSLFTableCell.DEFAULT_WIDTH;
            }
            y += HSLFTableCell.DEFAULT_HEIGHT;
        }
        tblWidth = x;
        tblHeight = y;
        setAnchor(new Rectangle(0, 0, tblWidth, tblHeight));

        EscherContainerRecord spCont = (EscherContainerRecord) getSpContainer().getChild(0);
        AbstractEscherOptRecord opt = new EscherOptRecord();
        opt.setRecordId((short)RecordTypes.EscherUserDefined);
        opt.addEscherProperty(new EscherSimpleProperty((short)0x39F, 1));
        EscherArrayProperty p = new EscherArrayProperty((short)(0x4000 | 0x3A0), false, null);
        p.setSizeOfElements(0x0004);
        p.setNumberOfElementsInArray(numRows);
        p.setNumberOfElementsInMemory(numRows);
        opt.addEscherProperty(p);
        spCont.addChildBefore(opt, RecordTypes.EscherClientAnchor);
    }

    /**
     * Create a Table object and initilize it from the supplied Record container.
     *
     * @param escherRecord <code>EscherSpContainer</code> container which holds information about this shape
     * @param parent       the parent of the shape
     */
    public HSLFTable(EscherContainerRecord escherRecord, ShapeContainer<HSLFShape,HSLFTextParagraph> parent) {
        super(escherRecord, parent);
    }

    /**
     * Gets a cell
     *
     * @param row the row index (0-based)
     * @param col the column index (0-based)
     * @return the cell
     */
    public HSLFTableCell getCell(int row, int col) {
        return cells[row][col];
    }

    public int getNumberOfColumns() {
        return cells[0].length;
    }
    public int getNumberOfRows() {
        return cells.length;
    }

    protected void afterInsert(HSLFSheet sh){
        super.afterInsert(sh);

        EscherContainerRecord spCont = (EscherContainerRecord) getSpContainer().getChild(0);
        List<EscherRecord> lst = spCont.getChildRecords();
        AbstractEscherOptRecord opt = (AbstractEscherOptRecord)lst.get(lst.size()-2);
        EscherArrayProperty p = opt.lookup(0x3A0); 
        for (int i = 0; i < cells.length; i++) {
            HSLFTableCell cell = cells[i][0];
            int rowHeight = Units.pointsToMaster(cell.getAnchor().height);
            byte[] val = new byte[4];
            LittleEndian.putInt(val, 0, rowHeight);
            p.setElement(i, val);
            for (int j = 0; j < cells[i].length; j++) {
                HSLFTableCell c = cells[i][j];
                addShape(c);

                HSLFLine bt = c.getBorderTop();
                if(bt != null) addShape(bt);

                HSLFLine br = c.getBorderRight();
                if(br != null) addShape(br);

                HSLFLine bb = c.getBorderBottom();
                if(bb != null) addShape(bb);

                HSLFLine bl = c.getBorderLeft();
                if(bl != null) addShape(bl);

            }
        }

    }

    protected void initTable(){
        List<HSLFShape> shapeList = getShapes();

        Iterator<HSLFShape> shapeIter = shapeList.iterator();
        while (shapeIter.hasNext()) {
            HSLFShape shape = shapeIter.next();
            if (shape instanceof HSLFAutoShape) {
                HSLFAutoShape autoShape = (HSLFAutoShape)shape;
                EscherTextboxRecord etr = autoShape.getEscherChild(EscherTextboxRecord.RECORD_ID);
                if (etr != null) continue;
            }
            shapeIter.remove();
        }        
        
        Collections.sort(shapeList, new Comparator<HSLFShape>(){
            public int compare( HSLFShape o1, HSLFShape o2 ) {
                Rectangle anchor1 = o1.getAnchor();
                Rectangle anchor2 = o2.getAnchor();
                int delta = anchor1.y - anchor2.y;
                if (delta == 0) delta = anchor1.x - anchor2.x;
                // descending size
                if (delta == 0) delta = (anchor2.width*anchor2.height)-(anchor1.width*anchor1.height);
                return delta;
            }
        });
        
        int y0 = (shapeList.isEmpty()) ? -1 : shapeList.get(0).getAnchor().y - 1;
        int maxrowlen = 0;
        List<List<HSLFShape>> lst = new ArrayList<List<HSLFShape>>();
        List<HSLFShape> row = null;
        for (HSLFShape sh : shapeList) {
            if(sh instanceof HSLFTextShape){
                Rectangle anchor = sh.getAnchor();
                if(anchor.y != y0){
                    y0 = anchor.y;
                    row = new ArrayList<HSLFShape>();
                    lst.add(row);
                }
                row.add(sh);
                maxrowlen = Math.max(maxrowlen, row.size());
            }
        }
        cells = new HSLFTableCell[lst.size()][maxrowlen];
        for (int i = 0; i < lst.size(); i++) {
            row = lst.get(i);
            for (int j = 0; j < row.size(); j++) {
                HSLFTextShape tx = (HSLFTextShape)row.get(j);
                cells[i][j] = new HSLFTableCell(tx.getSpContainer(), getParent());
                cells[i][j].setSheet(tx.getSheet());
            }
        }
    }

    /**
     * Assign the <code>SlideShow</code> this shape belongs to
     *
     * @param sheet owner of this shape
     */
    public void setSheet(HSLFSheet sheet){
        super.setSheet(sheet);
        if(cells == null) initTable();
    }

    /**
     * Sets the row height.
     *
     * @param row the row index (0-based)
     * @param height the height to set (in pixels)
     */
    public void setRowHeight(int row, int height){
        int currentHeight = cells[row][0].getAnchor().height;
        int dy = height - currentHeight;

        for (int i = row; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Rectangle anchor = cells[i][j].getAnchor();
                if(i == row) anchor.height = height;
                else anchor.y += dy;
                cells[i][j].setAnchor(anchor);
            }
        }
        Rectangle tblanchor = getAnchor();
        tblanchor.height += dy;
        setAnchor(tblanchor);

    }

    /**
     * Sets the column width.
     *
     * @param col the column index (0-based)
     * @param width the width to set (in pixels)
     */
    public void setColumnWidth(int col, int width){
        int currentWidth = cells[0][col].getAnchor().width;
        int dx = width - currentWidth;
        for (int i = 0; i < cells.length; i++) {
            Rectangle anchor = cells[i][col].getAnchor();
            anchor.width = width;
            cells[i][col].setAnchor(anchor);

            if(col < cells[i].length - 1) for (int j = col+1; j < cells[i].length; j++) {
                anchor = cells[i][j].getAnchor();
                anchor.x += dx;
                cells[i][j].setAnchor(anchor);
            }
        }
        Rectangle tblanchor = getAnchor();
        tblanchor.width += dx;
        setAnchor(tblanchor);
    }

    /**
     * Format the table and apply the specified Line to all cell boundaries,
     * both outside and inside
     *
     * @param line the border line
     */
    public void setAllBorders(HSLFLine line){
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                HSLFTableCell cell = cells[i][j];
                cell.setBorderTop(cloneBorder(line));
                cell.setBorderLeft(cloneBorder(line));
                if(j == cells[i].length - 1) cell.setBorderRight(cloneBorder(line));
                if(i == cells.length - 1) cell.setBorderBottom(cloneBorder(line));
            }
        }
    }

    /**
     * Format the outside border using the specified Line object
     *
     * @param line the border line
     */
    public void setOutsideBorders(HSLFLine line){
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                HSLFTableCell cell = cells[i][j];

                if(j == 0) cell.setBorderLeft(cloneBorder(line));
                if(j == cells[i].length - 1) cell.setBorderRight(cloneBorder(line));
                else {
                    cell.setBorderLeft(null);
                    cell.setBorderLeft(null);
                }

                if(i == 0) cell.setBorderTop(cloneBorder(line));
                else if(i == cells.length - 1) cell.setBorderBottom(cloneBorder(line));
                else {
                    cell.setBorderTop(null);
                    cell.setBorderBottom(null);
                }
            }
        }
    }

    /**
     * Format the inside border using the specified Line object
     *
     * @param line the border line
     */
    public void setInsideBorders(HSLFLine line){
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                HSLFTableCell cell = cells[i][j];

                if(j != cells[i].length - 1)
                    cell.setBorderRight(cloneBorder(line));
                else {
                    cell.setBorderLeft(null);
                    cell.setBorderLeft(null);
                }
                if(i != cells.length - 1) cell.setBorderBottom(cloneBorder(line));
                else {
                    cell.setBorderTop(null);
                    cell.setBorderBottom(null);
                }
            }
        }
    }

    private HSLFLine cloneBorder(HSLFLine line){
        HSLFLine border = createBorder();
        border.setLineWidth(line.getLineWidth());
        border.setLineDashing(line.getLineDashing());
        border.setLineColor(line.getLineColor());
        border.setLineCompound(line.getLineCompound());
        return border;
    }

    /**
     * Create a border to format this table
     *
     * @return the created border
     */
    public HSLFLine createBorder(){
        HSLFLine line = new HSLFLine(this);

        AbstractEscherOptRecord opt = getEscherOptRecord();
        setEscherProperty(opt, EscherProperties.GEOMETRY__SHAPEPATH, -1);
        setEscherProperty(opt, EscherProperties.GEOMETRY__FILLOK, -1);
        setEscherProperty(opt, EscherProperties.SHADOWSTYLE__SHADOWOBSURED, 0x20000);
        setEscherProperty(opt, EscherProperties.THREED__LIGHTFACE, 0x80000);

        return line;
    }
}
