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
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ddf.AbstractEscherOptRecord;
import org.apache.poi.ddf.EscherArrayProperty;
import org.apache.poi.ddf.EscherContainerRecord;
import org.apache.poi.ddf.EscherProperties;
import org.apache.poi.ddf.EscherSimpleProperty;
import org.apache.poi.sl.usermodel.FreeformShape;
import org.apache.poi.sl.usermodel.ShapeContainer;
import org.apache.poi.sl.usermodel.ShapeType;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.Units;

/**
 * A "Freeform" shape.
 *
 * <p>
 * Shapes drawn with the "Freeform" tool have cubic bezier curve segments in the smooth sections
 * and straight-line segments in the straight sections. This object closely corresponds to <code>java.awt.geom.GeneralPath</code>.
 * </p>
 */
public final class HSLFFreeformShape extends HSLFAutoShape implements FreeformShape<HSLFShape,HSLFTextParagraph> {

    public static final byte[] SEGMENTINFO_MOVETO   = new byte[]{0x00, 0x40};
    public static final byte[] SEGMENTINFO_LINETO   = new byte[]{0x00, (byte)0xAC};
    public static final byte[] SEGMENTINFO_ESCAPE   = new byte[]{0x01, 0x00};
    public static final byte[] SEGMENTINFO_ESCAPE2  = new byte[]{0x01, 0x20};
    public static final byte[] SEGMENTINFO_CUBICTO  = new byte[]{0x00, (byte)0xAD};
    public static final byte[] SEGMENTINFO_CUBICTO2 = new byte[]{0x00, (byte)0xB3}; //OpenOffice inserts 0xB3 instead of 0xAD.
    public static final byte[] SEGMENTINFO_CLOSE    = new byte[]{0x01, (byte)0x60};
    public static final byte[] SEGMENTINFO_END      = new byte[]{0x00, (byte)0x80};

    /**
     * Create a Freeform object and initialize it from the supplied Record container.
     *
     * @param escherRecord       <code>EscherSpContainer</code> container which holds information about this shape
     * @param parent    the parent of the shape
     */
   protected HSLFFreeformShape(EscherContainerRecord escherRecord, ShapeContainer<HSLFShape,HSLFTextParagraph> parent){
        super(escherRecord, parent);

    }

    /**
     * Create a new Freeform. This constructor is used when a new shape is created.
     *
     * @param parent    the parent of this Shape. For example, if this text box is a cell
     * in a table then the parent is Table.
     */
    public HSLFFreeformShape(ShapeContainer<HSLFShape,HSLFTextParagraph> parent){
        super((EscherContainerRecord)null, parent);
        _escherContainer = createSpContainer(ShapeType.NOT_PRIMITIVE, parent instanceof HSLFGroupShape);
    }

    /**
     * Create a new Freeform. This constructor is used when a new shape is created.
     *
     */
    public HSLFFreeformShape(){
        this(null);
    }

    @Override
    public int setPath(GeneralPath path) {
        Rectangle bounds = path.getBounds();
        PathIterator it = path.getPathIterator(new AffineTransform());

        List<byte[]> segInfo = new ArrayList<byte[]>();
        List<Point2D.Double> pntInfo = new ArrayList<Point2D.Double>();
        boolean isClosed = false;
        int numPoints = 0;
        while (!it.isDone()) {
            double[] vals = new double[6];
            int type = it.currentSegment(vals);
            switch (type) {
                case PathIterator.SEG_MOVETO:
                    pntInfo.add(new Point2D.Double(vals[0], vals[1]));
                    segInfo.add(SEGMENTINFO_MOVETO);
                    numPoints++;
                    break;
                case PathIterator.SEG_LINETO:
                    pntInfo.add(new Point2D.Double(vals[0], vals[1]));
                    segInfo.add(SEGMENTINFO_LINETO);
                    segInfo.add(SEGMENTINFO_ESCAPE);
                    numPoints++;
                    break;
                case PathIterator.SEG_CUBICTO:
                    pntInfo.add(new Point2D.Double(vals[0], vals[1]));
                    pntInfo.add(new Point2D.Double(vals[2], vals[3]));
                    pntInfo.add(new Point2D.Double(vals[4], vals[5]));
                    segInfo.add(SEGMENTINFO_CUBICTO);
                    segInfo.add(SEGMENTINFO_ESCAPE2);
                    numPoints++;
                    break;
                case PathIterator.SEG_QUADTO:
                    //TODO: figure out how to convert SEG_QUADTO into SEG_CUBICTO
                    logger.log(POILogger.WARN, "SEG_QUADTO is not supported");
                    break;
                case PathIterator.SEG_CLOSE:
                    pntInfo.add(pntInfo.get(0));
                    segInfo.add(SEGMENTINFO_LINETO);
                    segInfo.add(SEGMENTINFO_ESCAPE);
                    segInfo.add(SEGMENTINFO_LINETO);
                    segInfo.add(SEGMENTINFO_CLOSE);
                    isClosed = true;
                    numPoints++;
                    break;
            }

            it.next();
        }
        if(!isClosed) segInfo.add(SEGMENTINFO_LINETO);
        segInfo.add(new byte[]{0x00, (byte)0x80});

        AbstractEscherOptRecord opt = getEscherOptRecord();
        opt.addEscherProperty(new EscherSimpleProperty(EscherProperties.GEOMETRY__SHAPEPATH, 0x4));

        EscherArrayProperty verticesProp = new EscherArrayProperty((short)(EscherProperties.GEOMETRY__VERTICES + 0x4000), false, null);
        verticesProp.setNumberOfElementsInArray(pntInfo.size());
        verticesProp.setNumberOfElementsInMemory(pntInfo.size());
        verticesProp.setSizeOfElements(0xFFF0);
        for (int i = 0; i < pntInfo.size(); i++) {
            Point2D.Double pnt = pntInfo.get(i);
            byte[] data = new byte[4];
            LittleEndian.putShort(data, 0, (short)Units.pointsToMaster(pnt.getX() - bounds.getX()));
            LittleEndian.putShort(data, 2, (short)Units.pointsToMaster(pnt.getY() - bounds.getY()));
            verticesProp.setElement(i, data);
        }
        opt.addEscherProperty(verticesProp);

        EscherArrayProperty segmentsProp = new EscherArrayProperty((short)(EscherProperties.GEOMETRY__SEGMENTINFO + 0x4000), false, null);
        segmentsProp.setNumberOfElementsInArray(segInfo.size());
        segmentsProp.setNumberOfElementsInMemory(segInfo.size());
        segmentsProp.setSizeOfElements(0x2);
        for (int i = 0; i < segInfo.size(); i++) {
            byte[] seg = segInfo.get(i);
            segmentsProp.setElement(i, seg);
        }
        opt.addEscherProperty(segmentsProp);

        opt.addEscherProperty(new EscherSimpleProperty(EscherProperties.GEOMETRY__RIGHT, Units.pointsToMaster(bounds.getWidth())));
        opt.addEscherProperty(new EscherSimpleProperty(EscherProperties.GEOMETRY__BOTTOM, Units.pointsToMaster(bounds.getHeight())));

        opt.sortProperties();

        setAnchor(bounds);
        
        return numPoints;
    }

    @Override
    public GeneralPath getPath(){
        AbstractEscherOptRecord opt = getEscherOptRecord();
        opt.addEscherProperty(new EscherSimpleProperty(EscherProperties.GEOMETRY__SHAPEPATH, 0x4));

        EscherArrayProperty verticesProp = getEscherProperty(opt, (short)(EscherProperties.GEOMETRY__VERTICES + 0x4000));
        if(verticesProp == null) verticesProp = getEscherProperty(opt, EscherProperties.GEOMETRY__VERTICES);

        EscherArrayProperty segmentsProp = getEscherProperty(opt, (short)(EscherProperties.GEOMETRY__SEGMENTINFO + 0x4000));
        if(segmentsProp == null) segmentsProp = getEscherProperty(opt, EscherProperties.GEOMETRY__SEGMENTINFO);

        // return empty path if either GEOMETRY__VERTICES or GEOMETRY__SEGMENTINFO is missing, see Bugzilla 54188
        GeneralPath path = new GeneralPath();

        //sanity check
        if(verticesProp == null) {
            logger.log(POILogger.WARN, "Freeform is missing GEOMETRY__VERTICES ");
            return path;
        }
        if(segmentsProp == null) {
            logger.log(POILogger.WARN, "Freeform is missing GEOMETRY__SEGMENTINFO ");
            return path;
        }

        int numPoints = verticesProp.getNumberOfElementsInArray();
        int numSegments = segmentsProp.getNumberOfElementsInArray();
        for (int i = 0, j = 0; i < numSegments && j < numPoints; i++) {
            byte[] elem = segmentsProp.getElement(i);
            if(Arrays.equals(elem, SEGMENTINFO_MOVETO)){
                byte[] p = verticesProp.getElement(j++);
                short x = LittleEndian.getShort(p, 0);
                short y = LittleEndian.getShort(p, 2);
                path.moveTo(Units.masterToPoints(x), Units.masterToPoints(y));
            } else if (Arrays.equals(elem, SEGMENTINFO_CUBICTO) || Arrays.equals(elem, SEGMENTINFO_CUBICTO2)){
                i++;
                byte[] p1 = verticesProp.getElement(j++);
                short x1 = LittleEndian.getShort(p1, 0);
                short y1 = LittleEndian.getShort(p1, 2);
                byte[] p2 = verticesProp.getElement(j++);
                short x2 = LittleEndian.getShort(p2, 0);
                short y2 = LittleEndian.getShort(p2, 2);
                byte[] p3 = verticesProp.getElement(j++);
                short x3 = LittleEndian.getShort(p3, 0);
                short y3 = LittleEndian.getShort(p3, 2);
                path.curveTo(
                    Units.masterToPoints(x1), Units.masterToPoints(y1),
                    Units.masterToPoints(x2), Units.masterToPoints(y2),
                    Units.masterToPoints(x3), Units.masterToPoints(y3));

            } else if (Arrays.equals(elem, SEGMENTINFO_LINETO)){
                i++;
                byte[] pnext = segmentsProp.getElement(i);
                if(Arrays.equals(pnext, SEGMENTINFO_ESCAPE)){
                    if(j + 1 < numPoints){
                        byte[] p = verticesProp.getElement(j++);
                        short x = LittleEndian.getShort(p, 0);
                        short y = LittleEndian.getShort(p, 2);
                        path.lineTo(Units.masterToPoints(x), Units.masterToPoints(y));
                    }
                } else if (Arrays.equals(pnext, SEGMENTINFO_CLOSE)){
                    path.closePath();
                }
            }
        }
        
        Rectangle2D anchor = getAnchor();
        Rectangle2D bounds = path.getBounds2D();
        AffineTransform at = new AffineTransform();
        at.translate(anchor.getX(), anchor.getY());
        at.scale(
                anchor.getWidth()/bounds.getWidth(),
                anchor.getHeight()/bounds.getHeight()
        );
        return new GeneralPath(at.createTransformedShape(path));
    }
}
