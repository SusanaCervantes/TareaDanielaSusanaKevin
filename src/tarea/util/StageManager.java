package tarea.util;

import tarea.Tarea1;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class StageManager
{
	private static Stage mainStage;
	private static Stage modalStage;
	private static FXMLLoader mainLoader;
	private static final HashMap<String, FXMLLoader> LOADERS = new HashMap<>();
	private static FXMLLoader currentLoader;
	
	public static void initialize(){
		mainLoader = getLoader( "Root" );
		mainStage.setScene( new Scene( ( StackPane )mainLoader.getRoot() ) );
		modalStage = new Stage(){
			@Override
			public void close(){
				super.close();
				StackPane pane = ( ( StackPane )mainStage.getScene().getRoot() );
				pane.getChildren().remove( pane.getChildren().size() - 1 );
			}
		};
		modalStage.setAlwaysOnTop( true );
//		modalStage.setOnShown( event -> {
//			( ( StackPane )mainStage.getScene().getRoot() ).getChildren().add( new StackPane() );
//		} );
		modalStage.setScene( new Scene( ( StackPane )getLoader( "ModalRoot" ).getRoot() ) );
	}
	
	public static void setMainStage( Stage stage )
	{
		mainStage = stage;
		currentLoader = null;
	}
	
	public static Stage getMainStage(){
		return mainStage;
	}
	
	public static void setModalStage( Stage stage ){
		modalStage = stage;
	}
	
	public static Stage getModalStage(){
		return modalStage;
	}
	
	public static FXMLLoader getMainLoader(){
		return mainLoader;
	}
	
	public static FXMLLoader getLoader( String loaderName )
	{
		FXMLLoader loader = null;
		if ( !LOADERS.containsKey( loaderName ) )
		{
			try 
			{
                loader = new FXMLLoader( Tarea1.class.getResource( "view/" + loaderName + ".fxml" ));
			//	loader = new FXMLLoader( Tarea1.class.getResource( "view/" + loaderName + ".fxml" ), LanguageHandler.getLanguage() );
				loader.load();
				LOADERS.put( loaderName, loader );
			} 
			catch (IOException ex) 
			{
				Logger.getLogger(StageManager.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		else
		{
			loader = LOADERS.get( loaderName );
		}
		return loader;
	}
	
	public static void loadContent( String content )
	{
		currentLoader = getLoader( content );
		( ( StackPane )( (BorderPane)( ( StackPane )mainStage.getScene().getRoot() ).getChildren().get( 1 ) ).getCenter() ).getChildren().clear();
		( ( StackPane )( (BorderPane)( ( StackPane )mainStage.getScene().getRoot() ).getChildren().get( 1 ) ).getCenter() ).getChildren().add( currentLoader.getRoot() );
		( (Controller)currentLoader.getController() ).load();
	}
	
	public static void loadContentInModal( String content ){
		( ( StackPane )modalStage.getScene().getRoot() ).getChildren().clear();
		( ( StackPane )modalStage.getScene().getRoot() ).getChildren().add( getLoader( content ).getRoot() );
		( ( Controller )getLoader( content ).getController() ).load();
	}
	
	public static FXMLLoader getCurrentLoader()
	{
		return currentLoader;
	}
	
	public static void clear(){
		LOADERS.clear();
	}
}