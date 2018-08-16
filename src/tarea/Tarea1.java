package tarea;

import javafx.application.Application;
import javafx.stage.Stage;
import tarea.util.StageManager;

/**
 *
 * @author tvkev
 */
public class Tarea1 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        StageManager.setMainStage(stage);
        StageManager.initialize();
        StageManager.loadContent("LogIn");
        StageManager.getMainStage().show();
//        StageManager.loadContentInModal("LogIn");
//        StageManager.getModalStage().show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
