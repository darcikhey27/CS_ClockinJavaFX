package application;

// imports
import java.net.URL;
import java.util.ResourceBundle;

import com.sun.org.apache.bcel.internal.generic.LASTORE;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField; // use this do not use awt shit
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller implements Initializable
{

	// text boxes and output stuff

	// TODO: work on this thing that is giving me problems or watch youtube
	// videos
	@FXML TextField textName;
	@FXML TextField textID;

	@FXML
	private TextField textDisplay;

	/* main method for getting user input using mouse click */
	@FXML
	public void buttonClick(ActionEvent event)
	{
		String digit = ((Button) event.getSource()).getText();
		String old = textDisplay.getText();
		String newText = old + digit;
		textDisplay.setText(newText);
	}

	
	/* method writing input to the textDisplay textFiled */
	private void writeInput(int number)
    {
        if (textDisplay.getLength() < 15)
        {
        	String oldText = textDisplay.getText();
            textDisplay.setText(oldText+number);
        }
        //btnEnter.Focus();
    }// End of wrtieNumber method.
	
	/* getting user input from the keyboard */
	@FXML
	public void getKeyboardbInput(KeyEvent key)
	{
		KeyCode input = key.getCode();
		// testing for DIGITS from 0 to 10
		switch(input)
		{
		case DIGIT0:
			writeInput(0);
			break;
		case DIGIT1:
			writeInput(1);
			break;
		case DIGIT2:
			writeInput(2);
			break;
		case DIGIT3:
			writeInput(3);
			break;
		case DIGIT4:
			writeInput(4);
			break;
		case DIGIT5:
			writeInput(5);
			break;
		case DIGIT6:
			writeInput(6);
			break;
		case DIGIT7:
			writeInput(7);
			break;
		case DIGIT8:
			writeInput(8);
			break;
		case DIGIT9:
			writeInput(9);
			break;
		
		default:
			break;
		}
	}
	
	// load a new student into the program
	@FXML
	public void addNewStudent()
	{
		//connect to the load student form 
		// return the student/s
		
	}
	// standard message box to show anything//
	public void showMsgBox(String output)
	{
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("About");
		alert.setHeaderText(null);
		alert.setContentText(output);

		alert.showAndWait();
		
	}
	@FXML
	public void showAboutMsgbox()
	{
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("About");
		alert.setHeaderText(null);
		alert.setContentText("App built by Darci K Saucedo\n"
				+ "Computer Science Student at Eastern Washington University\n"
				+ "Mind Wide Open!");

		alert.showAndWait();
		
	}
	@FXML
	public void clearDisplayBox() // clear display box
	{
		textDisplay.setText("");
	}
	
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		// TODO Auto-generated method stub

	}
	

}
