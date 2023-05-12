package pane;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class TopGamePane extends HBox {
	public TopGamePane() {
		this.setBackground(new Background(new BackgroundFill(Color.DARKGREEN, null, null)));
		this.setPrefWidth(800);
		this.setPrefHeight(200);
		this.setPadding(new Insets(15));
		BackButton btn1 = new CreateButton.createBackButton();
		this.getChildren().add(btn1);
		Text shotCount = new Text("0");
		this.getChildren().add(shotCount);
	}
	
	
}
