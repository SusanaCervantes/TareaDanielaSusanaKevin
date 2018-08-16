/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.Controller;

import com.jfoenix.controls.JFXDatePicker;
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
 * @author tvkev
 */
public class RegistroDeEquiposController implements Controller, Initializable {

    @FXML
    private StackPane root;
    @FXML
    private JFXDatePicker prueba;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      //  prueba.getValue().
    }    

    @Override
    public Node getRoot() {
        return this.root;
    }

    @Override
    public void load() {
    }
    
}
