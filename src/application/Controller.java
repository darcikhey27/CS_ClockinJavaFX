package application;

import java.awt.TextArea;
import java.awt.TextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

public class Controller 
{
	
	@FXML
	private  TextField textOut;
	@FXML TextArea lblOut;
	
	@FXML
	public void buttonClick(KeyEvent key)
	{
		System.out.println(key.getText());
		System.out.println(key.getCode());
		System.out.println(key.getCode());
	}
	

}
