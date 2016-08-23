package application;

import java.io.IOException;
//imports
import java.net.URL;
import java.util.ResourceBundle;

import com.sun.org.apache.bcel.internal.generic.LASTORE;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField; // use this do not use awt shit
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Test2Scenes
{
	@FXML
	private Button btn1;

	@FXML
	private void handleButtonAction(ActionEvent event) throws IOException
	{
		Stage stage;
		Parent root;

		// get reference to the button's stage
		stage = (Stage) btn1.getScene().getWindow();
		// load up OTHER FXML document
		root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));

		// create a new scene with root and set the stage
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
