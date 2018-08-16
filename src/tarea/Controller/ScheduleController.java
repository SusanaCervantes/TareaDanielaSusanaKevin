/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.Controller;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
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
import tarea.Partido;
import tarea.util.Controller;
import tarea.util.StageManager;

/**
 * FXML Controller class
 *
 * @author Susy03
 */
public class ScheduleController implements Initializable, Controller {

	@FXML
	private StackPane root;
	@FXML
	private JFXDatePicker dpDia;
	@FXML
	private JFXTextField tfHora;
	@FXML
	private JFXCheckBox ckDisponible;
	@FXML
	private JFXTextField tfEquipo;
	@FXML
	private JFXComboBox<String> cbAceptaReto;
	@FXML
	private JFXTextField tfOponente;
	@FXML
	private JFXTextField tfGanador;
	@FXML
	private TableColumn<Partido, String> tcHora;
	@FXML
	private TableColumn<Partido, String> tcEquipo;
	@FXML
	private TableColumn<Partido, String> tcAceptaReto;
	@FXML
	private TableColumn<Partido, String> tcOponente;
	@FXML
	private TableView<Partido> tbAgenda;
	@FXML
	private TableColumn<Partido, String> tcGanador;
	@FXML
	private TableColumn<Partido, String> tcMarcador;
	@FXML
	private JFXTextField tfMarcador;
	
	ObservableList <Partido> partidos;
	Partido partidoSeleccionado;


	@Override
	public void initialize(URL url, ResourceBundle rb) {
		tcHora.setCellValueFactory(x -> new SimpleStringProperty(""+x.getValue().getHora())); 
		tcEquipo.setCellValueFactory(x -> new SimpleStringProperty(x.getValue().getEquipo().getNombreEquipo()));
		tcAceptaReto.setCellValueFactory(x -> new SimpleStringProperty(x.getValue().getAceptaReto().toString()));
		tcOponente.setCellValueFactory(x -> new SimpleStringProperty(x.getValue().getOponente().getNombreEquipo()));
		tcGanador.setCellValueFactory(x -> new SimpleStringProperty(x.getValue().getGanador().getNombreEquipo()));
		tcMarcador.setCellValueFactory(x -> new SimpleStringProperty(x.getValue().getMarcador()));
		
		cbAceptaReto.getItems().addAll("Si", "No");
		
		
	}	

	@Override
	public Node getRoot() {
		return this.root; 
	}

	@Override
	public void load() {
		
	}

	@FXML
	private void btnGuardar(ActionEvent event) {
		
	}

	@FXML
	private void btnAtras(ActionEvent event) {
		StageManager.loadContent("MenuCanchas");
        StageManager.getMainStage().show();
	}

	@FXML
	private void tblSeleccionada(MouseEvent event) {
		if(tbAgenda.getSelectionModel().getSelectedItem()!=null)
		{
			partidoSeleccionado = tbAgenda.getSelectionModel().getSelectedItem(); 
			tfHora.setText(""+partidoSeleccionado.getHora()); 
			tfEquipo.setText(partidoSeleccionado.getEquipo().getNombreEquipo());
			tfGanador.setText(partidoSeleccionado.getGanador().getNombreEquipo());
			tfOponente.setText(partidoSeleccionado.getOponente().getNombreEquipo());
			if(!partidoSeleccionado.getAceptaReto())
			{
				cbAceptaReto.setValue("No");
			}else{
			if(partidoSeleccionado.getAceptaReto())
			{
				cbAceptaReto.setValue("Si");
			}
			}
		}
	}

	@FXML
	private void btnLimpiar(ActionEvent event) {
		tfHora.setText(""); 
		tfEquipo.setText("");
		tfGanador.setText("");
		tfMarcador.setText("");
		tfOponente.setText("");
		ckDisponible.setSelected(false);
		cbAceptaReto.setValue("");
		
	}

	
}
