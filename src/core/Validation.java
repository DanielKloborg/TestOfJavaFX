package core;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Validation extends Application{

	Stage window;
	Scene scene;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Title");
		
		//Form
		TextField nameInput = new TextField();
		
		button = new Button ("Click me");
		button.setOnAction(e -> isInt(nameInput,nameInput.getText()));
		
		//Layout
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(nameInput,button);
		
		scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}
	
	private boolean isInt(TextField input, String message) {
		try {
			int number = Integer.parseInt(input.getText());
			System.out.println("User typed: "+ number);
			return true;
		}
		catch(NumberFormatException e){
			System.out.println("User is stupid, " + message + " is not a number");
			return false;
		}
	}
}