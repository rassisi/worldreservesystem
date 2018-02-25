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

package org.apache.poi.sl.draw;

import static org.apache.poi.sl.draw.Drawable.DRAW_FACTORY;

import java.awt.Graphics2D;
import java.awt.font.TextLayout;
import java.text.AttributedString;

import org.apache.poi.sl.usermodel.Background;
import org.apache.poi.sl.usermodel.ConnectorShape;
import org.apache.poi.sl.usermodel.FreeformShape;
import org.apache.poi.sl.usermodel.GroupShape;
import org.apache.poi.sl.usermodel.MasterSheet;
import org.apache.poi.sl.usermodel.PictureShape;
import org.apache.poi.sl.usermodel.PlaceableShape;
import org.apache.poi.sl.usermodel.Shape;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.sl.usermodel.Slide;
import org.apache.poi.sl.usermodel.TableShape;
import org.apache.poi.sl.usermodel.TextBox;
import org.apache.poi.sl.usermodel.TextParagraph;
import org.apache.poi.sl.usermodel.TextShape;

public class DrawFactory {
    protected static final ThreadLocal<DrawFactory> defaultFactory = new ThreadLocal<DrawFactory>();

    /**
     * Set a custom draw factory for the current thread.
     * This is a fallback, for operations where usercode can't set a graphics context.
     * Preferably use the rendering hint {@link Drawable#DRAW_FACTORY} to set the factory.
     *
     * @param factory
     */
    public static void setDefaultFactory(DrawFactory factory) {
        defaultFactory.set(factory);
    }

    public static DrawFactory getInstance(Graphics2D graphics) {
        // first try to find the factory over the rendering hint
        DrawFactory factory = null;
        boolean isHint = false;
        if (graphics != null) {
            factory = (DrawFactory)graphics.getRenderingHint(DRAW_FACTORY);
            isHint = (factory != null);
        }
        // secondly try the thread local default
        if (factory == null) {
            factory = defaultFactory.get();
        }
        // and at last, use the default factory
        if (factory == null) {
            factory = new DrawFactory();
        }
        if (graphics != null && !isHint) {
            graphics.setRenderingHint(DRAW_FACTORY, factory);
        }
        return factory;
    }

    public Drawable getDrawable(Shape<?,?> shape) {
        if (shape instanceof TextBox) {
            return getDrawable((TextBox<?,?>)shape);
        } else if (shape instanceof FreeformShape) {
            return getDrawable((FreeformShape<?,?>)shape);
        } else if (shape instanceof TextShape) {
            return getDrawable((TextShape<?,?>)shape);
        } else if (shape instanceof TableShape) {
            return getDrawable((TableShape<?,?>)shape);
        } else if (shape instanceof GroupShape) {
            return getDrawable((GroupShape<?,?>)shape);
        } else if (shape instanceof PictureShape) {
            return getDrawable((PictureShape<?,?>)shape);
        } else if (shape instanceof Background) {
            return getDrawable((Background<?,?>)shape);
        } else if (shape instanceof ConnectorShape) {
            return getDrawable((ConnectorShape<?,?>)shape);
        } else if (shape instanceof Slide) {
            return getDrawable((Slide<?,?>)shape);
        } else if (shape instanceof MasterSheet) {
            return getDrawable((MasterSheet<?,?>)shape);
        } else if (shape instanceof Sheet) {
            return getDrawable((Sheet<?,?>)shape);
        } else if (shape.getClass().isAnnotationPresent(DrawNotImplemented.class)) {
            return new DrawNothing(shape);
        }
        
        throw new IllegalArgumentException("Unsupported shape type: "+shape.getClass());
    }

    public DrawSlide getDrawable(Slide<?,?> sheet) {
        return new DrawSlide(sheet);
    }

    public DrawSheet getDrawable(Sheet<?,?> sheet) {
        return new DrawSheet(sheet);
    }

    public DrawMasterSheet getDrawable(MasterSheet<?,?> sheet) {
        return new DrawMasterSheet(sheet);
    }

    public DrawTextBox getDrawable(TextBox<?,?> shape) {
        return new DrawTextBox(shape);
    }

    public DrawFreeformShape getDrawable(FreeformShape<?,?> shape) {
        return new DrawFreeformShape(shape);
    }

    public DrawConnectorShape getDrawable(ConnectorShape<?,?> shape) {
        return new DrawConnectorShape(shape);
    }
    
    public DrawTableShape getDrawable(TableShape<?,?> shape) {
        return new DrawTableShape(shape);
    }
    
    public DrawTextShape getDrawable(TextShape<?,?> shape) {
        return new DrawTextShape(shape);
    }

    public DrawGroupShape getDrawable(GroupShape<?,?> shape) {
        return new DrawGroupShape(shape);
    }
    
    public DrawPictureShape getDrawable(PictureShape<?,?> shape) {
        return new DrawPictureShape(shape);
    }
    
    public DrawTextParagraph getDrawable(TextParagraph<?,?,?> paragraph) {
        return new DrawTextParagraph(paragraph);
    }

    public DrawBackground getDrawable(Background<?,?> shape) {
        return new DrawBackground(shape);
    }
    
    public DrawTextFragment getTextFragment(TextLayout layout, AttributedString str) {
        return new DrawTextFragment(layout, str);
    }
    
    public DrawPaint getPaint(PlaceableShape<?,?> shape) {
        return new DrawPaint(shape);
    }
}
