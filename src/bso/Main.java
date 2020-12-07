package bso;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	

	

		 @Override
		    public void start(Stage primaryStage) throws Exception {
			
			 FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getClassLoader().getResource("LoginPage.fxml"));
		        Pane root = (Pane)loader.load();
		        
		        Scene scene = new Scene(root);
		        
		        primaryStage.setScene(scene);
		        primaryStage.show();
		 }

public static void main(String[] args) {
	// TODO Auto-generated method stub
	//LibroSingleton Ls = LibroSingleton.getIstance();
	//Ls.getLibro();
	launch(args);
}
}