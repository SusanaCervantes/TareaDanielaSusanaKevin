/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import tarea.Equipo;
import tarea.util.Controller;
import tarea.util.StageManager;


public class RankingController implements Controller,Initializable {

	@FXML
	private StackPane stp_root;
	@FXML
	private TableColumn<Equipo, String> tc_Equipo;
	@FXML
	private TableColumn<Equipo, String> tc_Puntos;
	@FXML
	private TableColumn<Equipo, String> tc_Promedio;
	@FXML
	private TableView<Equipo> tb_Ranking;
	
	ObservableList <Equipo> equipos;
	Equipo equipo;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		tc_Equipo.setCellValueFactory(x->new SimpleStringProperty(x.getValue().getNombreEquipo()));
		tc_Puntos.setCellValueFactory(x->new SimpleStringProperty(""+x.getValue().getPuntos()));
		tc_Promedio.setCellValueFactory(x->new SimpleStringProperty(""+x.getValue().getPromedioDeRendimientol()));
		
		equipo=new Equipo(34,10,"Equipo1");
		equipos=FXCollections.observableArrayList();
		equipos.add(equipo);
		tb_Ranking.setItems(equipos);
	}	

	@FXML
	private void evt_Ordenar(ActionEvent event) {
	}

	@FXML
	private void evt_volver(ActionEvent event) {
		StageManager.loadContent("MenuCanchas");
	}

	@Override
	public Node getRoot() 
	{
		return this.stp_root;
	}

	@Override
	public void load() {
}
	
}
