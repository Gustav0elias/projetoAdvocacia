package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class telaInserirController implements Initializable{

	@FXML
	private AnchorPane inserirScene;
	@FXML
	private TextField txfAbertura;
	@FXML
	private TextField txfResponsavel;
	@FXML
	private TextField txfCodigo;
	@FXML
	private TextField txfData;
	@FXML
	private TextField txfNome;
	@FXML
	private TextField txfCpf;
	@FXML
	private TextField txfIdade;
	
	Repositorio repositorio = new Repositorio();

	
	public void  inserir() {
		
		int abertura = parseInt(txfAbertura.getText());
		String responsavel = txfResponsavel.getText();
		int codigo = parseInt(txfCodigo.getText());
		Processo processo = new Comum (abertura, responsavel, codigo);
		repositorio.inserir(processo);
		System.out.println("testando");
		repositorio.mostrarRelatorio();
	
		//repositorioAlt.inserir(processo);
		
	
		
		/*processo.setIdade_abertura(txfAbertura.getText());
		processo.setResponsavel(txfResponsavel.getText());
		processo.getCliente().setNome(txfNome.getText());
		processo.getCliente().setCpf(txfCpf.getText());
		repositorio.inserir(processo);*/
	}
	
	private int parseInt(String text) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void cancelar() {
		try {

			 FXMLLoader loader = new FXMLLoader(getClass().getResource("telaInicial.fxml")); 
			 AnchorPane root = loader.load(); 
			 Scene scene = new Scene (root);
			 Stage primaryStage= (Stage) inserirScene.getScene().getWindow();
			 primaryStage.setScene(scene);
			 
			 
				}catch (IOException e) {
					e.printStackTrace();
				}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void updateProcesso () {
		
	}
}
