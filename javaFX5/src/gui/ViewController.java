package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{

	@FXML
	private TextField txtNum1;

	@FXML
	private TextField txtNum2;

	@FXML
	private Label labelResult;

	@FXML
	private Button btSum;	

	@FXML
	public void onBtSumAction() {
		Locale.setDefault(Locale.US);

		if(txtNum1.getText().isEmpty() || txtNum2.getText().isEmpty()) {
			Alerts.showAlert("Aviso!", "Dados não preenchidos", "Favor preencher os campos", AlertType.INFORMATION);
		}else {
			try {
				double number1 = Double.parseDouble(txtNum1.getText());
				double number2 = Double.parseDouble(txtNum2.getText());
				double result  = number1 + number2;

				labelResult.setText(String.format("%.2f", result));
			}catch (NumberFormatException e) {
				Alerts.showAlert("Erro", null, "Você digitou um carcater que não é um número", AlertType.ERROR);
				txtNum1.setText(null);
				txtNum2.setText(null);
				labelResult.setText(null);
			}
		}

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		Constraints.setTextFieldDouble(txtNum1);
		Constraints.setTextFieldDouble(txtNum2);
		Constraints.setTextFieldMaxLength(txtNum1, 8);
		Constraints.setTextFieldMaxLength(txtNum2, 8);
		
		
	}

}
