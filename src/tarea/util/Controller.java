
package tarea.util;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import tarea.Tarea1;

public interface Controller{
    public Node getRoot(); 
    
    public static Controller load(String screenName) 
	{
        try{
            FXMLLoader loader = new FXMLLoader(); 
            loader.setLocation(Tarea1.class.getResource("view/"+screenName+".fxml"));
            loader.load();
            return loader.getController();
        }catch(IOException ex) {
            return null;
        }
    }
	
	public void load();
}
