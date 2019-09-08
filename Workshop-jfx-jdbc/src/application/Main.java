package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			ScrollPane scrollpane = loader.load();
			
			scrollpane.setFitToHeight(true); // ajusta o scrollpane na altura da tela
			scrollpane.setFitToWidth(true);  //ajusta o scrollpane na largura da tela
			
			Scene mainScene = new Scene(scrollpane);
			
			mainScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Sample JavaFX application");	
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
