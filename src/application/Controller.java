package application;

// imports
import java.net.URL;
import java.util.ResourceBundle;

import com.sun.org.apache.bcel.internal.generic.LASTORE;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField; // use this do not use awt shit
import javafx.scene.input.KeyEvent;

public class Controller implements Initializable
{
	
	// text boxes and output stuff
	
	//TODO: work on this thing that is giving me problems or watch youtube videos
	
	@FXML
	private TextField textDisplay;
	
	
//	@FXML
	public void buttonClick(ActionEvent event)
	{
		
			String digit = ((Button)event.getSource()).getText();
			String b = digit;
			b += digit;
//			System.out.println(digit);
//			System.out.print(digit);
		
			textDisplay.setText(b);
		
		
	}


	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	

}
