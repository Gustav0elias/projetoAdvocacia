package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
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
	private TextField txfDia;
	@FXML
	private TextField txfMes;
	@FXML
	private TextField txfAno;
	@FXML
	private TextField txfNome;
	@FXML
	private TextField txfCpf;
	@FXML
	private TextField txfIdade;
	@FXML
	private TextField txfCodmembro;
	@FXML
	private TextField txftxfNvara;
	@FXML
	private RadioButton radioCriminal;
	@FXML
	private RadioButton radioComum;
	
	@FXML 
	private Button botaoInserir;
	
	


	
	public void  inserir() {
		int abertura = Integer.parseInt(txfAbertura.getText());
		String responsavel = txfResponsavel.getText();
		int codigo = Integer.parseInt(txfCodigo.getText());
		
		String nome = txfNome.getText();
		String cpf = txfCpf.getText();
		String idade = txfIdade.getText();
		
		String dia = txfDia.getText();
		String mes = txfMes.getText();
		String ano = txfAno.getText();
		
		//if( radioComum.isSelected()) {
		
		Processo processoComum = new Comum(abertura, responsavel, codigo, new Cliente(nome, cpf, idade), new Data(dia, mes, ano));
	
		new Repositorio().inserir(processoComum);
		
		Alert alertInserido = new Alert(Alert.AlertType.INFORMATION);
		alertInserido.setTitle("Inserido");
		alertInserido.setContentText("O cadastro foi realizado Com sucesso");
		alertInserido.showAndWait();}
		
		
		
	//	else if (radioCriminal.isSelected()) {
		//	int nVara = Integer.parseInt(txftxfNvara.getText());
			
			//Processo p = new Criminal(abertura, responsavel, codigo, nVara, new Cliente(nome, cpf, idade));
		//}
			
		
		
		/*int abertura = Integer.parseInt(txfAbertura.getText());
		String responsavel = txfResponsavel.getText();
		int codigo = Integer.parseInt(txfCodigo.getText());
		String nome = txfNome.getText();
		String cpf = txfCpf.getText();
		int idade = Integer.parseInt(txfIdade.getText());
		
		*/
	
		//repositorioAlt.inserir(processo);
		
	
		
		/*processo.setIdade_abertura(txfAbertura.getText());
		processo.setResponsavel(txfResponsavel.getText());
		processo.getCliente().setNome(txfNome.getText());
		processo.getCliente().setCpf(txfCpf.getText());
		repositorio.inserir(processo);*/
	//}
	
	



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
