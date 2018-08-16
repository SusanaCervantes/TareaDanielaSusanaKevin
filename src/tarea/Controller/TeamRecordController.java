/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import tarea.util.Controller;

/**
 * FXML Controller class
 *
 * @author Susy03
 */
public class TeamRecordController implements Initializable, Controller {

	@FXML
	private TableView<?> tvHistorial;
	@FXML
	private TableColumn<?, ?> tcEquipo;
	@FXML
	private TableColumn<?, ?> tcOponente;
	@FXML
	private TableColumn<?, ?> tcResultado;
	@FXML
	private TableColumn<?, ?> tcGanador;
	@FXML
	private TableColumn<?, ?> tcCancha;
	@FXML
	private TableColumn<?, ?> tcFecha;
	@FXML
	private TableColumn<?, ?> tcHora;
	@FXML
	private StackPane root;
	@FXML
	private Label lblNombreEquipo;
	@FXML
	private Label lblPuestoRanking;
	@FXML
	private Label lblPromedioRendimiento;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	

	@Override
	public Node getRoot() {
		return this.root; 
	}

	@Override
	public void load() {
		
	}
	
}
