package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {
	
	public static Stage currentStage(ActionEvent event){
		//caputura o stage do botão na tela atual
		return (Stage)((Node) event.getSource()).getScene().getWindow();
		
	}

}
