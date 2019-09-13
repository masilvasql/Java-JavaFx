package gui;

import java.net.URL;
import java.util.ResourceBundle;

import db.DbException;
import gui.util.Alerts;
import gui.util.Constraints;
import gui.util.Utils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;
import model.services.DepartmentService;

public class DepartmentFormController implements Initializable {

	private Department entity;
	private DepartmentService service;

	@FXML
	private TextField txtId;

	@FXML
	private TextField txtName;

	@FXML
	private Label labelErrorName;

	@FXML
	private Button btnSave;

	@FXML
	private Button btnCancel;

	public void setDepartment(Department entity) {
		this.entity = entity;
	}

	public void setDepartmentService(DepartmentService service) {
		this.service = service;
	}

	@FXML
	public void onBtnSaveAction(ActionEvent event) {

	
		if (txtName.getText() == null){

			Alerts.showAlert("Aviso!", "Campo obrigatório não preenchido", "Favor preencher o campo nome",
					AlertType.WARNING);

		} else {
			if (entity == null) {
				throw new IllegalStateException("entity null");
			}

			if (service == null) {
				throw new IllegalStateException("Service null");
			}

			try {
				entity = getFormData();
				service.saveOrUpdate(entity);
				Alerts.showAlert("Aviso!", null, "Departamento salvo com sucesso!", AlertType.INFORMATION);
				Utils.currentStage(event).close();
			} catch (DbException e) {
				Alerts.showAlert("Aviso!", "Erro", "Erro ao salvar no banco de dados", AlertType.ERROR);
			}
		}

	}

	private Department getFormData() {
		Department obj = new Department();

		obj.setId(Utils.tryParseToInt(txtId.getText()));
		obj.setName(txtName.getText());

		return obj;
	}

	@FXML
	public void onBtnCancelAction(ActionEvent event) {
		Utils.currentStage(event).close();
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		intializeNodes();

	}

	private void intializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
	}

	public void updateFormData() {
		if (entity == null) {
			throw new IllegalStateException("entity was null");
		} else {
			txtId.setText(String.valueOf(entity.getId()));
			txtName.setText(entity.getName());
		}

	}

}
