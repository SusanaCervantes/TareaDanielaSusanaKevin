/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.Controller;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import tarea.util.Controller;
import tarea.util.StageManager;


public class InfoEquiposController implements Controller,Initializable {

	@FXML
	private JFXTextField txf_usuario;
	@FXML
	private JFXTextField txf_contraseña;
	@FXML
	private JFXTextField txf_nombre_equipo;
	@FXML
	private StackPane stp_root;

	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	

	@FXML
	private void evt_modificar(ActionEvent event) {
	}

	@FXML
	private void evt_consultar(ActionEvent event) {
	}

	@FXML
	private void evt_volver(ActionEvent event) 
	{
		StageManager.loadContent("Menu");
	}

	@Override
	public Node getRoot() 
	{
		return this.stp_root;
	}

	@Override
	public void load() 
	{
		
	}
	
}
