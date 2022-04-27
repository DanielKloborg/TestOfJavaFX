package core;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CloseProgram extends Application{
	
	Stage window;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Title");
		
		//When user tries to close, do this:
		window.setOnCloseRequest(e -> {
			e.consume();
			closeProgram();
		});

		button = new Button("Close program");
		button.setOnAction(e -> closeProgram());
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}
	
	private void closeProgram() {
		boolean answer = ConfirmBox.display("Title","Sure you want to exit?");
		if(answer) {
			window.close();
		}
	}
}

