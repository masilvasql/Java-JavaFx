package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button btTest;	
	
	@FXML
	public void onBtTestAction() {

		Alerts.showAlert(
					"Aviso!", 
					"Campos obrigatórios não preenchdos!", 
					"Favor preencher todos os campos", 
					AlertType.ERROR);
	}
	
}
