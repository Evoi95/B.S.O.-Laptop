package application;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

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
	private void scarica()
	{
		CD.scaricaLibro();
	}
	@FXML
	private void pulisci()
	{
		CD.annullaOrdine();
	}
	
	public BoundaryDownload()
	{
		CD=new ControllerDownload();
	}
	

}
