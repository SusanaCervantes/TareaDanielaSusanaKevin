/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import tarea.util.Controller;

/**
 * FXML Controller class
 *
 * @author Susy03
 */
public class MenuEquiposController implements Initializable,Controller
{

	@FXML
	private StackPane stp_root;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	

	@FXML
	private void evt_info(ActionEvent event) {
	}

	@FXML
	private void evt_alquiler(ActionEvent event) {
	}

	@FXML
	private void evt_ranking(ActionEvent event) {
	}

	@FXML
	private void evt_consulta(ActionEvent event) {
	}

	@Override
	public Node getRoot() {
	return this.stp_root;
	}

	@Override
	public void load() {
		
	}
	
}
