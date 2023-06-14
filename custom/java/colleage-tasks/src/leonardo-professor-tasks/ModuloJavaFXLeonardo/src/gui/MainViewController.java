package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class MainViewController  {

	@FXML
	private Button btnMore;
	@FXML
	private Button btnLess;
	@FXML
	private Label number;

	private Integer value = 0;

	@FXML
	public void onBtnMoreAction() {
		value++;
		number.setText(value.toString());
		changeColor();
	}

	@FXML
	public void onBtnLessAction() {
		value--;
		number.setText(value.toString());
		changeColor();
		
	}

	public void changeColor() {
		Color x = value >= 0 ? Color.GREEN : Color.RED;
		number.setTextFill(x);
	}

}
