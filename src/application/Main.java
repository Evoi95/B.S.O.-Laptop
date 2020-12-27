package application;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import database.CreateDefaultDB;
import factoryBook.Libro;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	// private static Libro l;
	@Override
	public void start(Stage primaryStage) {

		try {
			// FXMLLoader loader = FXMLLoader();
			// loader.setLocation(new
			// URL("file:///C:/Users/dani/eclipse-workspace/prova/src/application/Login.fxml"));

			Parent root = FXMLLoader.load(getClass().getResource("homePage.fxml"));

			Scene scene = new Scene(root);
			primaryStage.setTitle("Benvenuto nella homePage");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		try {
			CreateDefaultDB.createDefaultDB();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// l=new Libro();
		// l.scarica();

		launch(args);

	}
}
