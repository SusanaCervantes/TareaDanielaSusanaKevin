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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import tarea.Tarea1;
import tarea.util.Controller;

/**
 *
 * @author tvkev
 */
public class RootController implements Controller, Initializable {

	@FXML
	private StackPane root;
	@FXML
	private ImageView background;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        background.fitWidthProperty().bind( root.widthProperty() );
	background.fitHeightProperty().bind( root.heightProperty() );
    }

    @Override
    public Node getRoot() {
        return root;
    }

	@Override
	public void load() {
	}
	
	public void loadBackground( String url ){
		Image image = new Image( Tarea1.class.getResourceAsStream( "fonts/" + url ) );
		background.setImage( image );
	}
}

