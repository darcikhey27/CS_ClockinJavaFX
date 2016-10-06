package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class AppTester extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		try
		{
			VBox root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
			// Parent root =
			// FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Student ClockIN");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Error in AppTester try catch block");
		}
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
