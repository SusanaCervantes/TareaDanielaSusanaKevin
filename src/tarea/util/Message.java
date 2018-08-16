
package tarea.util;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Window;

public class Message 
{

    public void show(AlertType type, String title, String message) 
	{
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }

    public void showModal(AlertType type, String title, Window father, String message) 
	{
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.initOwner(father);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public Boolean showConfirmation(String title, Window father, String message) 
	{
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.initOwner(father);
        alert.setContentText(message);
        Optional<ButtonType> result = alert.showAndWait();

        return result.get() == ButtonType.OK;
    }
}
