
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


public class InfoController implements Controller, Initializable 
{

	@FXML
	private StackPane stp_root;
	@FXML
	private JFXTextField txf_usuario;
	@FXML
	private JFXTextField txf_contraseña;
	@FXML
	private JFXTextField txf_nombre;
	@FXML
	private JFXTextField txf_telefono;
	@FXML
	private JFXTextField txf_horario;
	@FXML
	private JFXTextField txf_costo_dia;
	@FXML
	private JFXTextField txf_costo_noche;
	@FXML
	private JFXTextField txf_cant_jugadores;
	@FXML
	private JFXTextField txf_direccion;

	
	@Override
	public void initialize(URL url, ResourceBundle rb) 
	{
		// TODO
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

	@FXML
	private void evt_Modificar(ActionEvent event) {
	}

	@FXML
	private void evt_Consultar(ActionEvent event) {
	}

	@FXML
	private void evt_volver(ActionEvent event) 
	{
		StageManager.loadContent("Menu");
	}
	
}
