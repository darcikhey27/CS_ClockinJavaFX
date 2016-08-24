package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.sun.java_cup.internal.runtime.Scanner;
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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import student.Student;
import student.StudentLinkedList;
import sun.reflect.generics.tree.VoidDescriptor;

import java.util.*;

public class MainController implements Initializable {

	// fields for StudentLoad scene
	@FXML
	private TextField txtUserName;
	@FXML
	private TextField txtID;
	@FXML
	private Button closeButton;

	// student linkedlist
	private StudentLinkedList list = new StudentLinkedList();

	//////////////////////////////////////

	@FXML
	private TextField textDisplay;

	/* main method for getting user input using mouse click */
	@FXML
	public void buttonClick(ActionEvent event) {
		String digit = ((Button) event.getSource()).getText();
		String old = textDisplay.getText();
		String newText = old + digit;
		textDisplay.setText(newText);
	}

	/* method writing input to the textDisplay textFiled */
	private void writeInput(int number) {
		if (textDisplay.getLength() < 10) {
			String oldText = textDisplay.getText();
			textDisplay.setText(oldText + number);
		}
		// btnEnter.Focus();
	}// End of wrtieNumber method.

	/* getting user input from the keyboard */
	@FXML
	public void getKeyboardbInput(KeyEvent key) {
		KeyCode input = key.getCode();
		// testing for DIGITS from 0 to 10
		switch (input) {
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

	
	// standard message box to show anything//
	public void showMsgBox(String output) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("About");
		alert.setHeaderText(null);
		alert.setContentText(output);

		alert.showAndWait();

	}

	@FXML
	public void showAboutMsgbox() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("About");
		alert.setHeaderText(null);
		alert.setContentText("App built by Darci K Saucedo\n"
				+ "Computer Science Student at Eastern Washington University\n" + "Mind Wide Open!");

		alert.showAndWait();

	}

	// load a new student into the program
	@FXML
	public String menuFileAddnew_btnClick(ActionEvent event) throws IOException {
		// crate nodes for the new stage

		Stage newStage = new Stage();
		// create the Root Node: Pane
		/* this Pane element has to math in the FXML file */
		Pane root = FXMLLoader.load(getClass().getResource("StudentLoadScene.fxml"));

		// create a new scene with root and set the stage
		Scene scene = new Scene(root);
		// create a new stage

		newStage.setScene(scene);
		newStage.show();

		// if(Studnet form is good, return that student

		return "return something";
	}
	
	@FXML
	public void printList(ActionEvent event)
	{
		System.out.println(list);
	}

	// close add new student stage
	@FXML
	public void handleCloseButtonAction(ActionEvent event) 
	{
		Stage stage = (Stage) closeButton.getScene().getWindow();
		stage.close();
	}

	@FXML
	public void handleEnterButton(ActionEvent event) {

		String name = txtUserName.getText();
		int id = 0;
		// cast
		try 
		{
			 id = Integer.parseInt(txtID.getText());
			
		}
		catch(Exception e)
		{
			showMsgBox("Enter a valid integer for ID");
		}
		
		
		Student student = new Student(name, id);
		list.addNode(student);
		
		resetLabels();
	

	}
	@FXML
	public void resetLabels()
	{
		// reset labels
		txtUserName.setText("");
		txtID.setText("");
	}

	@FXML
	public void handleAddAnotherButtonAction() {
		txtUserName.setText("");
		txtID.setText("");
	}

	@FXML
	public void clearDisplayBox() // clear display box
	{
		textDisplay.setText("");
	}

	public java.util.Scanner readFile(String filename) {
		java.util.Scanner inf = null;
		try {
			inf = new java.util.Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		return inf;

	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
