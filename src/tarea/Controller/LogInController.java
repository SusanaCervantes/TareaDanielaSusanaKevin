/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import tarea.util.Controller;
import tarea.util.Mensaje;
import tarea.util.StageManager;

/**
 * FXML Controller class
 *
 * @author tvkev
 */
public class LogInController implements Controller, Initializable {

    @FXML
    private StackPane root;
    @FXML
    private ImageView imvFondo;
    @FXML
    private JFXButton btnEquipo;
    @FXML
    private JFXButton btnCancha;
    @FXML
    private JFXTextField tfNombreUsuario;
    @FXML
    private JFXPasswordField pfContraseña;
    @FXML
    private JFXButton btnIngresar;

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

    @FXML
    private void evtSelectEquipo(ActionEvent event) {
        btnCancha.setOpacity(0.22);
        btnEquipo.setOpacity(1);
        tfNombreUsuario.setPromptText("Nombre de equipo");
        btnIngresar.setDisable(false);
    }

    @FXML
    private void evtSelectCancha(ActionEvent event) {
        btnEquipo.setOpacity(0.22);
        btnCancha.setOpacity(1);
        tfNombreUsuario.setPromptText("Nombre de cancha");
        btnIngresar.setDisable(false);
    }

    @FXML
    private void evtCancelar(ActionEvent event) {
        tfNombreUsuario.setText("");
        pfContraseña.setText("");
    }

    @FXML
    private void evtIngresar(ActionEvent event) {
		StageManager.loadContent("MenuCanchas");
        StageManager.getMainStage().show();
		
        if(btnCancha.getOpacity()==1){
            if(validarIngreso()){
              
            }else{
                Mensaje.getInstance().mensajeDeError("El nombre de de usuario o la contraseña están incorrectos");
            }
        }else{
            if(validarIngreso()){
                
            }else{
                Mensaje.getInstance().mensajeDeError("El nombre de de usuario o la contraseña están incorrectos");
            }
        }
    }

    @FXML
    private void evtIrARegistrar(MouseEvent event) {
        if(btnCancha.getOpacity()==1&&btnEquipo.getOpacity()==1){
            Mensaje.getInstance().mensajeDeError("Por favor seleccione un tipo de usuario (Cancha/Equipo) que desea registrar e intentelo de nuevo.");
        }else{
            if(btnCancha.getOpacity()==1){
                StageManager.loadContent( "RegistroDeCanchas" );
                StageManager.getMainStage().show(); 
            }else{
                StageManager.loadContent( "RegistroDeEquipos" );
                StageManager.getMainStage().show(); 

            }
        }
    }
    
    boolean validarIngreso(){
        return true;
    }

   
    
}
