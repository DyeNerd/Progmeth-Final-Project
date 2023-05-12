package pane;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TopGamePane extends BorderPane {
	public TopGamePane() {
		this.setBackground(new Background(new BackgroundFill(Color.DARKGREEN, null, null)));
		this.setPrefWidth(800);
		this.setPrefHeight(75);
		this.setPadding(new Insets(15));
		BackButton btn1 = new BackButton();
		Text shotCount = new Text("Shot Count: 0");	
		shotCount.setFont(new Font(20));
		this.setLeft(btn1);
		this.setRight(shotCount);
	}
	
	
}
