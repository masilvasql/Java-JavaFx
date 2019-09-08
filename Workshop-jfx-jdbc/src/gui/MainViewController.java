package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemSeller;

	@FXML
	private MenuItem menuItemDepartment;

	@FXML
	private MenuItem menuItemAbout;

	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("Seller");
	}

	@FXML
	public void onMenuDepartmentAction() {
		loadView("/gui/DepartmentList.fxml");
	}

	@FXML
	public void onMenuItemAboutAction() {
		loadView("/gui/About.fxml");
	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {

	}

	private synchronized void loadView(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVbox = loader.load(); // abre a nova tela
			
			Scene mainScene = Main.getMainScene(); //instancia a cena onde será aberta a nova tela, neste caso, dentro da mainview
			
			VBox  mainVbox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent(); // instancia a hierarquia do mainView
			
			Node mainMenu = mainVbox.getChildren().get(0); //captura o item 0 (menu) da tela main
			
			mainVbox.getChildren().clear(); // limpa o conteúdo da tela main
			
			mainVbox.getChildren().add(mainMenu); //adiciona novamente o menu
			mainVbox.getChildren().addAll(newVbox.getChildren()); // adiciona a nova tela
			
		}catch (IOException e) {
			Alerts.showAlert("Aviso!", "IO/Excepetion", e.getMessage(), AlertType.ERROR);
		}
	}

}
