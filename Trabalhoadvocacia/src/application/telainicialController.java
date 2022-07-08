package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class telainicialController implements Initializable {

	@FXML
	private AnchorPane telaInicialScene;
	@FXML
	private Button botaoInserir;
	@FXML
	private Button botaoRemover;
	@FXML
	private Button botaoAlterar;
	@FXML
	private Button botaoRelatorio;


	public void onBotaoInserirAction() { 
		
		try {

	 FXMLLoader loader = new FXMLLoader(getClass().getResource("telaInserir.fxml")); 
	 AnchorPane root = loader.load(); 
	 Scene scene = new Scene (root);
	 Stage primaryStage= (Stage) telaInicialScene.getScene().getWindow();
	 primaryStage.setScene(scene);
	 
	 
		}catch (IOException e) {
			e.printStackTrace();
		}
	 
	} 
	
	public void onBotaoRemoverAction () {
		System.out.println("remover");
	}
	
	public void onBotaoAlterarAction () {
		System.out.println("inserir");
	}
	
	
	
	
	public void onBotaoRelatorioAction() { 
		
		try {

	 FXMLLoader loader = new FXMLLoader(getClass().getResource("telaRelatorio.fxml")); 
	 AnchorPane root = loader.load(); 
	 Scene scene = new Scene (root);
	 Stage primaryStage= (Stage) telaInicialScene.getScene().getWindow();
	 primaryStage.setScene(scene);
	 
	 
		}catch (IOException e) {
			e.printStackTrace();
		}
	 
	} 
	
	public void onBotaoSairAction() {
		
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		
	}
	
	
	
	
	


}
