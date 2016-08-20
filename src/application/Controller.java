package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField; // use this do not use awt shit
import javafx.scene.input.KeyEvent;

public class Controller implements Initializable
{
	
	// text boxes and output stuff
	
	//TODO: work on this thing that is giving me problems or watch youtube videos
	
	@FXML
	private TextField textDisplay;
	
	
	@FXML
	public void buttonClick(KeyEvent event)
	{
		TextField buttonText = (TextField) event.getSource();
		textDisplay.setText(buttonText.toString());
		
//		System.out.println(key.getText());
//		System.out.println(key.getCode());
//		System.out.println(key.getCode());
	}


	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	

}
