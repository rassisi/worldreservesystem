/**
 * Copyright (c) 2013, ControlsFX
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *     * Neither the name of ControlsFX, any associated website, nor the
 * names of its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL CONTROLSFX BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package impl.org.controlsfx.skin;

import org.controlsfx.control.GridView;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.IndexedCell;
import javafx.scene.control.Skin;

/**
 * A GridRow is a container for {@link GridCell}, and represents a single
 * row inside a {@link GridView}.
 */
class GridRow<T> extends IndexedCell<T>{


    /**************************************************************************
     * 
     * Constructors
     * 
     **************************************************************************/	

    /**
     * 
     */
    public GridRow() {
        super();
        getStyleClass().add("grid-row");

        // we need to do this (or something similar) to allow for mouse wheel
        // scrolling, as the GridRow has to report that it is non-empty (which
        // is the second argument going into updateItem).
        indexProperty().addListener(new InvalidationListener() {
            @Override public void invalidated(Observable observable) {
                updateItem(null, getIndex() == -1);
            }
        });
    }

    /**
     * {@inheritDoc}
     */
    @Override protected Skin<?> createDefaultSkin() {
        return new GridRowSkin<T>(this);
    }



    /**************************************************************************
     * 
     * Properties
     * 
     **************************************************************************/

    /**
     * The {@link GridView} that this GridRow exists within.
     */
    public SimpleObjectProperty<GridView<T>> gridViewProperty() {
        return gridView;
    }
    private final SimpleObjectProperty<GridView<T>> gridView = 
            new SimpleObjectProperty<>(this, "gridView");
    
    /**
     * Sets the {@link GridView} that this GridRow exists within.
     */
    public final void updateGridView(GridView<T> gridView) {
        this.gridView.set(gridView);
    }
    
    /**
     * Returns the {@link GridView} that this GridRow exists within.
     */
    public GridView<T> getGridView() {
        return gridView.get();
    }
}
