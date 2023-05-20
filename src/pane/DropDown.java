package pane;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class DropDown extends HBox {
	public DropDown(RootPane rootPane) {
		ChoiceBox<String> choiceBox = new ChoiceBox<>();
		choiceBox.getItems().addAll("Map 1", "Map 2", "Map 3");
		choiceBox.setValue("Map 1");
		rootPane.setSelectedMap("Map 1");

		String soundFile = getClass().getResource("/clicksound.mp3").toString();
		Media buttonClickMedia = new Media(soundFile);
		MediaPlayer buttonClickSound;
		buttonClickSound = new MediaPlayer(buttonClickMedia);

		// Create a Button
		Button dropDownButton = new Button("Select");
		dropDownButton.getStyleClass().add("select-button");

		// Event handler for the button click
		dropDownButton.setOnAction(event -> {
			buttonClickSound.seek(Duration.ZERO);
			buttonClickSound.play();
			String selectedOption = choiceBox.getValue();
			System.out.println("Selected Option: " + selectedOption);
			if (selectedOption != null) {
				rootPane.setSelectedMap(selectedOption);
				rootPane.getGameScreen().reset();
			}
		});

		this.getChildren().addAll(choiceBox, dropDownButton);
		this.setSpacing(10);
		this.setAlignment(Pos.CENTER);
	}

	public HBox getDropDown() {
		return this;
	}
}
