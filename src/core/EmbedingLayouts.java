package core;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmbedingLayouts extends Application{
	
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Title");

		HBox topMenu = new HBox();
		Button buttonTop1 = new Button("First");
		Button buttonTop2 = new Button("Second");
		Button buttonTop3 = new Button("Thrid");
		topMenu.getChildren().addAll(buttonTop1,buttonTop2,buttonTop3);
		
		
		VBox leftMenu = new VBox();
		Button buttonLeft1 = new Button("First");
		Button buttonLeft2 = new Button("Second");
		Button buttonLeft3 = new Button("Thrid");
		leftMenu.getChildren().addAll(buttonLeft1,buttonLeft2,buttonLeft3);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setLeft(leftMenu);
		
		Scene scene = new Scene(borderPane, 300, 250);
		window.setScene(scene);
		window.show();
	}
}

