/**
 * Copyright (c) 2011, JFXtras
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the <organization> nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package jfxtras.labs.scene.control.radialmenu;

import java.util.ArrayList;
import java.util.List;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.FadeTransitionBuilder;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ParallelTransition;
import javafx.animation.ParallelTransitionBuilder;
import javafx.animation.Timeline;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.GroupBuilder;
import javafx.scene.Node;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CircleBuilder;
import javafx.util.Duration;

public class RadialMenu extends Group implements EventHandler<MouseEvent>,
	ChangeListener<Object> {

    public enum CenterVisibility {
	ALWAYS, WITH_MENU, NEVER
    }

    protected List<RadialMenuItem> items = new ArrayList<RadialMenuItem>();
    protected DoubleProperty innerRadius;
    protected DoubleProperty radius;
    protected DoubleProperty offset;
    protected DoubleProperty initialAngle;
    protected ObjectProperty<Paint> backgroundFill;
    protected ObjectProperty<Paint> backgroundMouseOnFill;
    protected ObjectProperty<Paint> strokeMouseOnFill;
    protected ObjectProperty<Paint> strokeFill;
    protected BooleanProperty clockwise;
    protected BooleanProperty backgroundVisible;
    protected BooleanProperty strokeVisible;
    protected ObjectProperty<CenterVisibility> centerVisibility;
    protected ObjectProperty<Node> centerGraphic;
    protected Circle centerStrokeShape;
    protected Group centerGroup;
    protected Group itemGroup;
    private boolean mouseOn = false;
    private double lastInitialAngleValue;
    private double lastOffsetValue;

    public Paint getBackgroundFill() {
	return this.backgroundFill.get();
    }

    public void setBackgroundFill(final Paint backgroundFill) {
	this.backgroundFill.set(backgroundFill);
    }

    public ObjectProperty<Paint> backgroundFillProperty() {
	return this.backgroundFill;
    }

    public Paint getBackgroundMouseOnFill() {
	return this.backgroundMouseOnFill.get();
    }

    public void setBackgroundMouseOnFill(final Paint backgroundMouseOnFill) {
	this.backgroundMouseOnFill.set(backgroundMouseOnFill);
    }

    public ObjectProperty<Paint> backgroundMouseOnFillProperty() {
	return this.backgroundMouseOnFill;
    }

    public Paint getStrokeMouseOnFill() {
	return this.strokeMouseOnFill.get();
    }

    public void setStrokeMouseOnFill(final Paint backgroundMouseOnFill) {
	this.strokeMouseOnFill.set(backgroundMouseOnFill);
    }

    public ObjectProperty<Paint> strokeMouseOnFillProperty() {
	return this.strokeMouseOnFill;
    }

    public Paint getStrokeFill() {
	return this.strokeFill.get();
    }

    public void setStrokeFill(final Paint strokeFill) {
	this.strokeFill.set(strokeFill);
    }

    public ObjectProperty<Paint> strokeFillProperty() {
	return this.strokeFill;
    }

    public Node getCenterGraphic() {
	return this.centerGraphic.get();
    }

    public void setCenterGraphic(final Node graphic) {
	if (this.centerGraphic.get() != null) {
	    this.centerGroup.getChildren().remove(this.centerGraphic.get());
	}
	if (graphic != null) {
	    this.centerGroup.getChildren().add(graphic);
	}
	this.centerGraphic.set(graphic);
    }

    public ObjectProperty<Node> centerGraphicProperty() {
	return this.centerGraphic;
    }

    public double getInitialAngle() {
	return this.initialAngle.get();
    }

    public DoubleProperty initialAngleProperty() {
	return this.initialAngle;
    }

    public double getInnerRadius() {
	return this.innerRadius.get();
    }

    public DoubleProperty innerRadiusProperty() {
	return this.innerRadius;
    }

    public double getRadius() {
	return this.radius.get();
    }

    public DoubleProperty radiusProperty() {
	return this.radius;
    }

    public double getOffset() {
	return this.offset.get();
    }

    public DoubleProperty offsetProperty() {
	return this.offset;
    }

    public boolean isClockwise() {
	return this.clockwise.get();
    }

    public BooleanProperty clockwiseProperty() {
	return this.clockwise;
    }

    public boolean isBackgroundVisible() {
	return this.backgroundVisible.get();
    }

    public BooleanProperty backgroundVisibleProperty() {
	return this.backgroundVisible;
    }

    public BooleanProperty strokeVisibleProperty() {
	return this.strokeVisible;
    }

    public boolean isStrokeVisible() {
	return this.strokeVisible.get();
    }

    public ObjectProperty<CenterVisibility> centerVisibilityProperty() {
	return this.centerVisibility;
    }

    public CenterVisibility getCenterVisibility() {
	return this.centerVisibility.get();
    }

    public void setCenterVisibility(final CenterVisibility visibility) {
	this.centerVisibility.set(visibility);
    }

    public RadialMenu() {

    }

    public RadialMenu(final double initialAngle, final double innerRadius,
	    final double radius, final double offset, final Paint bgFill,
	    final Paint bgMouseOnFill, final Paint strokeFill,
	    final Paint strokeMouseOnFill, final boolean clockwise,
	    final CenterVisibility centerVisibility, final Node centerGraphic) {
	this.itemGroup = GroupBuilder.create().build();
	this.getChildren().add(this.itemGroup);

	this.initialAngle = new SimpleDoubleProperty(initialAngle);
	this.initialAngle.addListener(new ChangeListener<Number>() {

	    @Override
	    public void changed(
		    final ObservableValue<? extends Number> paramObservableValue,
		    final Number paramT1, final Number paramT2) {
		RadialMenu.this.setInitialAngle(paramObservableValue.getValue()
			.doubleValue());
	    }
	});

	this.innerRadius = new SimpleDoubleProperty(innerRadius);
	this.strokeFill = new SimpleObjectProperty<Paint>(strokeFill);
	this.strokeFill.addListener(this);

	this.radius = new SimpleDoubleProperty(radius);
	this.offset = new SimpleDoubleProperty(offset);
	this.clockwise = new SimpleBooleanProperty(clockwise);
	this.backgroundFill = new SimpleObjectProperty<Paint>(bgFill);
	this.backgroundFill.addListener(this);
	this.backgroundMouseOnFill = new SimpleObjectProperty<Paint>(
		bgMouseOnFill);
	this.backgroundMouseOnFill.addListener(this);
	this.strokeMouseOnFill = new SimpleObjectProperty<Paint>(
		strokeMouseOnFill);
	this.strokeMouseOnFill.addListener(this);
	this.strokeVisible = new SimpleBooleanProperty(true);
	this.backgroundVisible = new SimpleBooleanProperty(true);

	this.centerVisibility = new SimpleObjectProperty<CenterVisibility>(
		centerVisibility);

	this.centerStrokeShape = CircleBuilder.create().radius(innerRadius)
		.stroke(strokeFill).fill(bgFill).build();
	this.centerStrokeShape.radiusProperty()
		.bind(this.innerRadiusProperty());
	this.centerVisibility.addListener(this);

	this.strokeVisible.addListener(this);
	this.backgroundVisible.addListener(this);

	this.centerGroup = GroupBuilder.create()
		.onMouseEntered(new EventHandler<MouseEvent>() {

		    @Override
		    public void handle(final MouseEvent event) {
			RadialMenu.this.mouseOn = true;
			RadialMenu.this.redraw();
		    }
		}).onMouseExited(new EventHandler<MouseEvent>() {

		    @Override
		    public void handle(final MouseEvent event) {
			RadialMenu.this.mouseOn = false;
			RadialMenu.this.redraw();
		    }
		}).onMouseClicked(new EventHandler<MouseEvent>() {

		    @Override
		    public void handle(final MouseEvent event) {
			final boolean visible = RadialMenu.this.itemGroup
				.isVisible();
			if (visible) {
			    RadialMenu.this.hideRadialMenu();
			} else {
			    RadialMenu.this.showRadialMenu();
			}

			event.consume();
		    }
		}).build();

	this.centerGroup.getChildren().add(this.centerStrokeShape);

	this.getChildren().add(this.centerGroup);
	this.centerGraphic = new SimpleObjectProperty<Node>(centerGraphic);
	this.setCenterGraphic(centerGraphic);

	this.saveStateBeforeAnimation();
    }

    public void setOnMenuItemMouseClicked(
	    final EventHandler<? super MouseEvent> paramEventHandler) {
	for (final RadialMenuItem item : this.items) {
	    item.setOnMouseClicked(paramEventHandler);
	}
    }

    public void setInitialAngle(final double angle) {
	this.initialAngle.set(angle);

	double angleOffset = this.initialAngle.get();
	for (final RadialMenuItem item : this.items) {
	    item.setStartAngle(angleOffset);
	    angleOffset = angleOffset + item.getMenuSize();
	}
    }

    public void setInnerRadius(final double radius) {
	this.innerRadius.set(radius);

    }

    public void setRadius(final double radius) {
	this.radius.set(radius);

    }

    public void setOffset(final double offset) {
	this.offset.set(offset);
    }

    public void setBackgroundVisible(final boolean visible) {
	this.backgroundVisible.set(visible);

    }

    public void setStrokeVisible(final boolean visible) {
	this.strokeVisible.set(visible);

    }

    public void setBackgroundColor(final Paint color) {
	this.backgroundFill.set(color);
    }

    public void setBackgroundMouseOnColor(final Paint color) {
	this.backgroundMouseOnFill.set(color);
    }

    public void setStrokeMouseOnColor(final Paint color) {
	this.strokeMouseOnFill.set(color);
    }

    public void setStrokeColor(final Paint color) {
	this.strokeFill.set(color);
    }

    public void setClockwise(final boolean clockwise) {
	this.clockwise.set(clockwise);
    }

    public void addMenuItem(final RadialMenuItem item) {
	item.visibleProperty().bind(this.visibleProperty());
	item.backgroundColorProperty().bind(this.backgroundFill);
	item.backgroundMouseOnColorProperty().bind(this.backgroundMouseOnFill);
	item.strokeMouseOnColorProperty().bind(this.strokeMouseOnFill);
	item.innerRadiusProperty().bind(this.innerRadius);
	item.radiusProperty().bind(this.radius);
	item.offsetProperty().bind(this.offset);
	item.strokeColorProperty().bind(this.strokeFill);
	item.clockwiseProperty().bind(this.clockwise);
	item.backgroundVisibleProperty().bind(this.backgroundVisible);
	item.strokeVisibleProperty().bind(this.strokeVisible);
	this.items.add(item);
	this.itemGroup.getChildren().add(this.itemGroup.getChildren().size(),
		item);
	double angleOffset = this.initialAngle.get();
	for (final RadialMenuItem it : this.items) {
	    it.setStartAngle(angleOffset);
	    angleOffset = angleOffset + item.getMenuSize();
	}
	item.setOnMouseClicked(this);
    }

    public void removeMenuItem(final RadialMenuItem item) {
	this.items.remove(item);
	this.itemGroup.getChildren().remove(item);
	item.visibleProperty().unbind();
	item.backgroundColorProperty().unbind();
	item.backgroundMouseOnColorProperty().unbind();
	item.innerRadiusProperty().unbind();
	item.radiusProperty().unbind();
	item.offsetProperty().unbind();
	item.strokeColorProperty().unbind();
	item.clockwiseProperty().unbind();
	item.backgroundVisibleProperty().unbind();
	item.strokeVisibleProperty().unbind();
	item.removeEventHandler(MouseEvent.MOUSE_CLICKED, this);
    }

    public void removeMenuItem(final int itemIndex) {
	final RadialMenuItem item = this.items.get(itemIndex);
	this.removeMenuItem(item);
    }

    @Override
    public void handle(final MouseEvent event) {
	if (event.getButton() == MouseButton.PRIMARY) {
	    final RadialMenuItem item = (RadialMenuItem) event.getSource();
	    item.setSelected(!item.isSelected());
	    for (final RadialMenuItem it : this.items) {
		if (it != item) {
		    it.setSelected(false);
		}
	    }
	    if (!item.isSelected()) {
		this.hideRadialMenu();
	    }
	    event.consume();
	}
    }

    public void hideRadialMenu() {
	this.saveStateBeforeAnimation();

	final List<Animation> anim = new ArrayList<Animation>();

	final FadeTransition fadeItemGroup = FadeTransitionBuilder.create()
		.node(this.itemGroup).fromValue(1).toValue(0)
		.duration(Duration.millis(300))
		.onFinished(new EventHandler<ActionEvent>() {

		    @Override
		    public void handle(final ActionEvent arg0) {
			RadialMenu.this.itemGroup.setVisible(false);
		    }
		}).build();

	anim.add(fadeItemGroup);

	if (this.centerVisibility.get() == CenterVisibility.WITH_MENU) {
	    final FadeTransition fadeCenter = FadeTransitionBuilder.create()
		    .node(this.centerGroup).fromValue(1).toValue(0)
		    .duration(Duration.millis(300))
		    .onFinished(new EventHandler<ActionEvent>() {

			@Override
			public void handle(final ActionEvent arg0) {
			    RadialMenu.this.centerGroup.setVisible(false);
			}
		    }).build();
	    anim.add(fadeCenter);
	}

	final ParallelTransition transition = ParallelTransitionBuilder
		.create().children(anim).build();

	transition.play();
    }

    public void showRadialMenu() {
	final List<Animation> anim = new ArrayList<Animation>();

	final FadeTransition fade = FadeTransitionBuilder.create()
		.node(this.itemGroup).duration(Duration.millis(400))
		.fromValue(0).toValue(1.0).build();
	anim.add(fade);

	final Animation offset = new Timeline(new KeyFrame(Duration.ZERO,
		new KeyValue(this.offsetProperty(), 0)), new KeyFrame(
		Duration.millis(300), new KeyValue(this.offsetProperty(),
			this.lastOffsetValue)));
	anim.add(offset);

	final Animation angle = new Timeline(new KeyFrame(Duration.ZERO,
		new KeyValue(this.initialAngleProperty(),
			this.lastInitialAngleValue + 20)), new KeyFrame(
		Duration.millis(300), new KeyValue(this.initialAngleProperty(),
			this.lastInitialAngleValue)));
	anim.add(angle);

	if (this.centerVisibility.get() == CenterVisibility.WITH_MENU) {
	    final FadeTransition fadeCenter = FadeTransitionBuilder.create()
		    .node(this.centerGroup).fromValue(0).toValue(1)
		    .duration(Duration.millis(300)).build();
	    anim.add(fadeCenter);

	    // final Animation radius = new Timeline(new KeyFrame(Duration.ZERO,
	    // new KeyValue(this.innerRadiusProperty(), 0)), new KeyFrame(
	    // Duration.millis(300), new KeyValue(
	    // this.innerRadiusProperty(),
	    // this.lastInnerRadiusValue)));
	    // anim.add(radius);

	    RadialMenu.this.centerGroup.setVisible(true);
	}

	final ParallelTransition transition = ParallelTransitionBuilder
		.create().children(anim).build();

	this.itemGroup.setVisible(true);
	transition.play();
    }

    private void saveStateBeforeAnimation() {
	this.lastInitialAngleValue = this.initialAngle.get();
	this.lastOffsetValue = this.offset.get();
    }

    @Override
    public void changed(final ObservableValue<? extends Object> arg0,
	    final Object arg1, final Object arg2) {
	this.redraw();
    }

    private void redraw() {
	if (this.centerVisibility.get() == CenterVisibility.NEVER) {
	    this.centerGroup.visibleProperty().set(false);
	} else if (this.centerVisibility.get() == CenterVisibility.ALWAYS) {
	    this.centerGroup.visibleProperty().set(true);
	} else {
	    this.centerGroup.visibleProperty().set(this.itemGroup.isVisible());
	}

	this.centerStrokeShape
		.setFill(this.backgroundVisible.get() ? (this.mouseOn
			&& this.backgroundMouseOnFill.get() != null ? this.backgroundMouseOnFill
			.get() : this.backgroundFill.get())
			: Color.TRANSPARENT);
	this.centerStrokeShape
		.setStroke(this.strokeVisible.get() ? (this.mouseOn
			&& this.strokeMouseOnFill.get() != null ? this.strokeMouseOnFill
			.get() : this.strokeFill.get())
			: Color.TRANSPARENT);
    }
}
