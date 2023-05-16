package main;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pane.BackButton;
import pane.RootPane;
import pane.WelcomePage;

public class Main extends Application {
	private Scene welcomePageScene;
	private Scene gameScene;
	private Stage stage;
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
    public void start(Stage stage) {
        // TODO: FILL CODE HERE
		this.stage = stage;
//		GameLogic logic = new GameLogic();
//		GolfCourse golfCourse = new GolfCourse();
//    	RootPane rootPane = new RootPane(golfCourse);
    	WelcomePage welcomePage = new WelcomePage(stage, this);
    	welcomePageScene = new Scene(welcomePage, 800, 640);
    	
//		StackPane root = new StackPane();
//		Scene scene = new Scene(root);
		stage.setScene(welcomePageScene);
		stage.setTitle("MiniGolf");
    	
//		GameLogic logic = new GameLogic();
//		GolfCourse golfCourse = new GolfCourse();
//		root.getChildren().add(golfCourse);
    	
    	stage.setResizable(false);
    	
//    	golfCourse.requestFocus();
    	stage.show();
    	
//    	AnimationTimer animation = new AnimationTimer() {
//    		public void handle(long now) {
//				golfCourse.paintComponent();
//				logic.logicUpdate();
////				RenderableHolder.getInstance().update();
//				InputUtility.updateInputState();
//    		}
//    	};
//    	animation.start();
    }
	
	public Scene getWelcomePageScene() {
		return this.welcomePageScene;
	}
	
	public Scene getGameScene() {
		return this.gameScene;
	}
	
	public void setGameScene(Scene gameScene) {
		this.gameScene = gameScene;
	}
	
	public Stage getStage() {
		return this.stage;
	}

		
}