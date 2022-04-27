package core;

import java.awt.Checkbox;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Checkingboxes extends Application{

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
		
		//Checkboxes
		Checkbox box1 = new Checkbox("Bacon");
		Checkbox box2 = new Checkbox("Chicken");
		
		//Button
		button = new Button();
		button.setText("Order now");
		
		//layout
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
//		layout.getChildren().addAll(box1,box2,button);
		
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}
	
	public void handle(ActionEvent event) {
		if (event.getSource()==button) {
			System.out.print("Lets goooooo!");
		}
	}
}

