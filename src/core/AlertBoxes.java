package core;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AlertBoxes extends Application{

	Stage window;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Title");
		
		button = new Button("Click me");
		//button.setOnAction(e -> AlertBoxes1.display("Tile of the window","Alert box"));
		button.setOnAction(e -> {
			boolean result = ConfirmBox.display("Tile of the window","Are you sure?");
			System.out.println(result);
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}
}