package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class LoadSceneController
{
	
	@FXML
	private TextField txtUserName;
	@FXML 
	private TextField txtID;
	@FXML
	private Button closeButton;
	
	
		// close add new student stage
		@FXML
		public void handleCloseButtonAction(ActionEvent event) 
		{
		    Stage stage = (Stage)closeButton.getScene().getWindow();
		    stage.close();
		}
		@FXML
		public void dialogBoxbtnClick(ActionEvent event)
		{
			String name = txtUserName.getText();
			System.out.println(name);
		}
		
		@FXML
		public void handleAddAnotherButtonAction()
		{
			txtUserName.setText("");
			txtID.setText("");
		}
	
	
	

}
