package application;

import java.awt.TextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller 
{
	@FXML
	private Label lblOut;
	@FXML
	private TextField textOut;
	
	@FXML
	public void buttonClick(ActionEvent event)
	{
		lblOut.setText("lblOut");
		textOut.setText("text field");
	}
	

}
