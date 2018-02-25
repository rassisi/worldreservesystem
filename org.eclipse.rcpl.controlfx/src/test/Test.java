package test;

import java.beans.IntrospectionException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.controlsfx.control.PropertySheet;
import org.controlsfx.control.PropertySheet.Item;
import org.controlsfx.property.BeanProperty;
import org.controlsfx.property.BeanPropertyUtils;

import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Test extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	private BigDecimal value = new BigDecimal(0);

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private Calendar cal;

	public void setCal(Calendar cal) {
		this.cal = cal;
	}

	public Calendar getCal() {
		return cal;
	}

	private LocalDateTime localDateTime;

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	private SimpleDoubleProperty prop = new SimpleDoubleProperty(0);

	private float floatX = 0;

	public float getFloatX() {
		return floatX;
	}

	public void setFloatX(float floatX) {
		this.floatX = floatX;
	}

	public void setProp(SimpleDoubleProperty prop) {
		this.prop = prop;
	}

	public SimpleDoubleProperty getProp() {
		return prop;
	}

	private Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	private boolean booleanX;

	public boolean isBooleanX() {
		return booleanX;
	}

	public void setBooleanX(boolean booleanX) {
		this.booleanX = booleanX;
	}

	private Font fontX;

	public Font getFontX() {
		return fontX;
	}

	public void setFontX(Font fontX) {
		this.fontX = fontX;
	}

	@Override
	public void start(Stage primaryStage) throws IntrospectionException {
		primaryStage.setTitle("Hello World!");

		StackPane st = new StackPane();

		st.setPrefHeight(500);
		VBox root = new VBox();
		st.getChildren().add(root);

		Button b = new Button("xxx");

		final ObservableList<Item> list = BeanPropertyUtils.getProperties(this);

		b.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				for (Item item : list) {

					BeanProperty p = (BeanProperty) item;

					System.out.println(p.getName() + ":  " + p.getValue());
				}

			}
		});

		PropertySheet s = new PropertySheet(list);
		root.getChildren().addAll(b, s);

		s.setPrefHeight(1000);
		primaryStage.setScene(new Scene(st, 600, 700));
		primaryStage.centerOnScreen();
		primaryStage.show();
	}
}
