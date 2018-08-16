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
import javafx.scene.layout.StackPane;
import tarea.util.Controller;

/**
 * FXML Controller class
 *
 * @author Susy03
 */
public class UbicacionController implements Initializable, Controller {

	@FXML
	private StackPane root;

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
