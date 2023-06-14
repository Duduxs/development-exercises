package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Program;
import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainViewController implements Initializable {

	private double posY = 0;
	private double posX = 0;

	private String oldValue;
	private String newValue;

	// Verify a symbol used
	private Character status;
	// Verify if button equal was clicked
	private Boolean equalUsed = false;

	@FXML
	private Button btnExit;
	@FXML
	private Button btnAbout;

	@FXML
	private Button btnSeven;
	@FXML
	private Button btnEight;
	@FXML
	private Button btnNine;
	@FXML
	private Button btnFour;
	@FXML
	private Button btnFive;
	@FXML
	private Button btnSix;
	@FXML
	private Button btnOne;
	@FXML
	private Button btnTwo;
	@FXML
	private Button btnThree;
	@FXML
	private Button btnZero;
	@FXML
	private Button btnPoint;
	@FXML
	private Button btnEqual;

	@FXML
	private Button btnmult;
	@FXML
	private Button btndiv;
	@FXML
	private Button btnsum;
	@FXML
	private Button btnmin;

	@FXML
	private TextField txtPanel;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Constraints.setTextFieldMaxLength(txtPanel, 7);
		txtPanel.setPromptText("0");


	}
	@FXML
	public void setBtnExitOnMouseEntered() {
		btnExit.setText("X");
	}
	
	@FXML
	public void setBtnExitOnMouseExit() {
		btnExit.setText("");
	}
	
	@FXML
	public void setBtnAboutOnMouseEntered() {
		btnAbout.setText("!");
	}
	
	@FXML
	public void setBtnAboutOnMouseExit() {
		btnAbout.setText("");
	}

	@FXML
	public void onBtnExitAction() {
		System.exit(1);

	}

	@FXML
	public void onBtnAboutAction() {
		Alerts.showAlert("About", null, "Github: Duduxs", AlertType.INFORMATION);
	}

	@FXML
	public void setOnMousePressed() {

		Program.getScene().setOnMousePressed(event -> {

			posX = Program.getStage().getX() - event.getScreenX();
			posY = Program.getStage().getY() - event.getScreenY();

		});
	}

	@FXML
	public void setOnMouseDragged() {

		Program.getScene().setOnMouseDragged(e -> {

			Program.getStage().setX(e.getScreenX() + posX);
			Program.getStage().setY(e.getScreenY() + posY);

		});
	}

	public void addText(String newText) {
		String text = txtPanel.getText();

		if (text.isEmpty() && newText.equals(","))
			text = "0,";
		else if (!text.contains(",") && newText.equals(","))
			text += newText;
		// Only add if text is an integer or double.
		else if (text.matches("\\d*") || text.matches("\\d*([\\,]\\d*)?"))
			text += newText;

		if (text.equals("00"))
			text = "0";
	
		txtPanel.setText(text);
		
	}

	@FXML
	public void onBtnSevenAction() {
		verify();
		addText("7");
	}

	@FXML
	public void onBtnEightAction() {
		verify();
		addText("8");
	}

	@FXML
	public void onBtnNineAction() {
		verify();
		addText("9");
	}

	@FXML
	public void onBtnFourAction() {
		verify();
		addText("4");
	}

	@FXML
	public void onBtnFiveAction() {
		verify();
		addText("5");
	}

	@FXML
	public void onBtnSixAction() {
		verify();
		addText("6");
	}

	@FXML
	public void onBtnOneAction() {
		verify();
		addText("1");
	}

	@FXML
	public void onBtnTwoAction() {
		verify();
		addText("2");
	}

	@FXML
	public void onBtnThreeAction() {
		verify();
		addText("3");
	}

	@FXML
	public void onBtnZeroAction() {
		verify();
		addText("0");
	}

	@FXML
	public void onBtnPointAction() {
		verify();
		addText(",");
	}

	@FXML
	public void onBtnEqualAction() {
		newValue = txtPanel.getText();
		// Replace avoid NumberFormatException 
		Double x = Double.parseDouble(oldValue.replace(",", "."));
		Double y = Double.parseDouble(newValue.replace(",", "."));

		switch (status) {
		case 'x':
			txtPanel.setText(String.format("%.2f", x * y));
			break;
		case '/':
			txtPanel.setText(String.format("%.2f", x / y));
			break;
		case '+':
			txtPanel.setText(String.format("%.2f", x + y));
			break;
		case '-':
			txtPanel.setText(String.format("%.2f", x - y));
			break;
		
		}
		txtPanel.setPromptText("0");
		equalUsed = true;

	}

	@FXML
	public void onBtnMultAction() {
		verify();
		// Get the old value pressioned after clear the painel.
		oldValue = txtPanel.getText();
		txtPanel.clear();
		txtPanel.setPromptText("x");
		status = 'x';

	}

	@FXML
	public void onBtnSumAction() {
		verify();
		// Get the old value pressioned after clear the painel.
		oldValue = txtPanel.getText();
		txtPanel.clear();
		txtPanel.setPromptText("+");
		status = '+';
	}

	@FXML
	public void onBtnMinAction() {
		verify();
		// Get the old value pressioned after clear the painel.
		oldValue = txtPanel.getText();
		txtPanel.clear();
		txtPanel.setPromptText("-");
		status = '-';
	}

	@FXML
	public void onBtnDivAction() {
		verify();
		// Get the old value pressioned after clear the painel.
		oldValue = txtPanel.getText();
		txtPanel.clear();
		txtPanel.setPromptText("÷");
		status = '/';
	}

	// Reset values for a new account
	public void verify() {
		if (equalUsed == true) {
			oldValue = "";
			newValue = "";
			txtPanel.setText("");
		}
		equalUsed = false;
	}

}
