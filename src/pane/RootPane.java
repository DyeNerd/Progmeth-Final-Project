package pane;

import javafx.scene.layout.VBox;

public class RootPane extends VBox {
	private static TopGamePane topGamePane;
	
	public RootPane() {
		topGamePane = new TopGamePane();
		this.getChildren().add(topGamePane);
	}
}
