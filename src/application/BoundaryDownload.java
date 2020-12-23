package application;

import java.io.IOException;

import com.itextpdf.text.DocumentException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BoundaryDownload {
	@FXML
	private SplitPane split;
	@FXML
	private AnchorPane ap1;
	@FXML
	private Label header;
	@FXML
	private AnchorPane ap2;
	@FXML
	private ImageView image;
	@FXML
	private Button buttonI;
	@FXML
	private Button buttonA;
	
	private ControllerDownload CD;
	
	@FXML
	private void scarica() throws IOException, DocumentException
	{
		CD.scaricaLibro();
		/*
		 * TODO
		 * modifico alert
		 */
		Stage stage;
		Parent root;
		stage=(Stage)buttonI.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("homePage.fxml"));
		

		//stage.setTitle("Schermata download");
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	}
	@FXML
	private void pulisci() throws IOException
	{
		CD.annullaOrdine();
		Stage stage;
		Parent root;
		stage=(Stage)buttonA.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("homePage.fxml"));
		/*
		 * TODO 
		 * modificio alert
		 */
		

		
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	}
	
	public BoundaryDownload()
	{
		CD=new ControllerDownload();
	}
	

}
