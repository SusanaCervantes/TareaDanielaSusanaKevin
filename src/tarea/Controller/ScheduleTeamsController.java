/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import tarea.Administrador;
import tarea.Cancha;
import tarea.Equipo;
import tarea.Fecha;
import tarea.Hora;
import tarea.Partido;
import tarea.util.Controller;
import tarea.util.StageManager;

/**
 * FXML Controller class
 *
 * @author Susy03
 */
public class ScheduleTeamsController implements Initializable, Controller {

	@FXML
	private StackPane root;
	@FXML
	private JFXDatePicker dpDia;
	@FXML
	private JFXComboBox<Cancha> cbCanchas;
	@FXML
	private TableView<Partido> tblCanchas;
	@FXML
	private TableColumn<Partido, String> tcHora;
	@FXML
	private TableColumn<Partido, String> tcDisponible;
	@FXML
	private TableColumn<Partido, String> tcEquipo;
	@FXML
	private TableColumn<Partido, String> tcEsperaReto;
	@FXML
	private TableColumn<Partido, String> tcOponente;
	@FXML
	private JFXButton btninfo;
	@FXML
	private JFXButton btnReservar;
	@FXML
	private JFXButton btnAceptaReto;
	
	private ObservableList<Partido> partidos; 
	private ObservableList<Cancha> canchas;
	private Cancha canchaSeleccionada = new Cancha(); 
	

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		tcHora.setCellValueFactory(x -> new SimpleStringProperty(""+x.getValue().getHora())); 
		tcEquipo.setCellValueFactory(x -> new SimpleStringProperty(x.getValue().getEquipo().getNombreEquipo()));
		tcEsperaReto.setCellValueFactory(x -> new SimpleStringProperty(x.getValue().getAceptaReto().toString()));
		tcOponente.setCellValueFactory(x -> new SimpleStringProperty(x.getValue().getOponente().getNombreEquipo()));
		tcEsperaReto.setCellValueFactory(x -> new SimpleStringProperty(x.getValue().getAceptaReto().toString()));
		
		btnReservar.setOpacity(0);
		btnReservar.setDisable(true);
		btninfo.setOpacity(0);
		btninfo.setDisable(true);
		btnAceptaReto.setOpacity(0);
		btnAceptaReto.setDisable(true);
		
		
		List<Hora> horas = (List<Hora>) new Hora();
		
		List<Fecha> Horario = (List<Fecha>) new Fecha(); 
		
		Cancha c = new Cancha(87873193,5,7,12, (float) 0.12,"Nombre",Horario);
		Equipo equipo = new Equipo(12,13,"NombreEquipo",14); 
		Equipo oponente = new Equipo(12,13,"NombreOponente",14);
		Administrador.getCanchas().add(c);
		Partido partido = new Partido(12, (Fecha) Horario,c,equipo,oponente,true,equipo,"2-0");
		Administrador.getCanchas().stream().filter(x-> x.getNombreCancha().contains(c.getNombreCancha())).findFirst().get().getPartidos().add(partido);
		canchaSeleccionada = c;
		//cbCanchas.setItems();
		partidos.add(partido);
		partidos = (ObservableList<Partido>) Administrador.getCanchas().stream().filter(x-> x.getNombreCancha().equals(canchaSeleccionada.getNombreCancha())).findFirst().get().getPartidos();
		tblCanchas.setItems(partidos);
	}	

	@Override
	public Node getRoot() {
		return this.root; 
	}

	@Override
	public void load() {
		
	}

	@FXML
	private void btnInfoEquipo(ActionEvent event) {
		StageManager.loadContentInModal("TeamRecord");
		StageManager.getModalStage().show();
	}

	@FXML
	private void dpDia(ActionEvent event) {
		if(dpDia.getValue()!=null&&cbCanchas.getValue()!=null){
		
		}
	}

	@FXML
	private void cbCanchas(ActionEvent event) {
		if(dpDia.getValue()!=null&&cbCanchas.getValue()!=null){
		
		}
	}


	@FXML
	private void btnAtras(ActionEvent event) {
		StageManager.loadContent("MenuCanchas");
        StageManager.getMainStage().show();
	}

	@FXML
	private void tbCanchas(MouseEvent event) {
		if(tblCanchas.getSelectionModel().getSelectedItem() != null){
			
		}
	}

	@FXML
	private void btnAceptaReto(ActionEvent event) {
	}

	@FXML
	private void btnReservar(ActionEvent event) {
	}

	@FXML
	private void btnLimpiar(ActionEvent event) {
		dpDia.setValue(null);
		cbCanchas.setValue(null);
	}
	
}
