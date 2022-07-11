package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class telaAlterarController {

	
	@FXML
	private AnchorPane alterarScene;
	
	@FXML
	private TextField txfAberturaAlt;
	@FXML
	private TextField txfResponsavelAlt;
	@FXML
	private TextField txfCodigoAlt;
	@FXML
	private TextField txfData;
	@FXML
	private TextField txfNomeAlt;
	@FXML
	private TextField txfCpfPesquisa;
	@FXML
	private TextField txfIdadeAlt;
	@FXML
	private TextField txfDiaAlt;
	@FXML
	private TextField txfMesAlt;
	@FXML
	private TextField txfAnoAlt;
	
	
	@FXML 
	private Button botaoAlterar;
	
	Repositorio rep = new Repositorio();
	telaRelatorioController rela = new telaRelatorioController ();
	
	
	public void verificar() {

		
		String cpfAlterar = txfCpfPesquisa.getText();
		
		
		for (int i =0; i<rep.getProcesso().size(); i++) {
			
			if (cpfAlterar.equals(rep.getProcesso().get(i).getCliente().getCpf())) {
				txfAberturaAlt.setText (String.valueOf( rep.getProcesso().get(i).getIdade_abertura()));
				txfResponsavelAlt.setText(rep.getProcesso().get(i).getResponsavel());
				txfCodigoAlt.setText (String.valueOf( rep.getProcesso().get(i).getCodigo()));
				txfNomeAlt.setText(rep.getProcesso().get(i).getCliente().getNome());
				txfIdadeAlt.setText (String.valueOf( rep.getProcesso().get(i).getCliente().getIdade()));
				txfDiaAlt.setText(rep.getProcesso().get(i).getData().getDia());
				txfMesAlt.setText(rep.getProcesso().get(i).getData().getMes());
				txfAnoAlt.setText(rep.getProcesso().get(i).getData().getAno());
		}
			else {
				Alert alertVerificar = new Alert(Alert.AlertType.WARNING);
				alertVerificar.setTitle("ERRO DE VERIFICAÇÃO");
				alertVerificar.setContentText("Esse cpf não está cadastrado no nosso banco de dados");
				alertVerificar.showAndWait();
					
			}
			
		}
			
		
	
			
			
		}
		
	
	public void alterar () {
		
		String cpfAlterar = txfCpfPesquisa.getText();
	
		int abertura = Integer.parseInt(txfAberturaAlt.getText());
		String responsavel = txfResponsavelAlt.getText();
		int codigo = Integer.parseInt(txfCodigoAlt.getText());
		String nome = txfNomeAlt.getText();
		String idade =txfIdadeAlt.getText();
		
		String dia = txfDiaAlt.getText();
		String mes = txfMesAlt.getText();
		String ano = txfAnoAlt.getText();
		
		
		for (int i =0; i<rep.getProcesso().size(); i++) {
			if (cpfAlterar.equals(rep.getProcesso().get(i).getCliente().getCpf())) {
				rep.getProcesso().get(i).setIdade_abertura(abertura);
				rep.getProcesso().get(i).setResponsavel(responsavel);
				rep.getProcesso().get(i).setCodigo(codigo);
				rep.getProcesso().get(i).getCliente().setNome(nome);
				rep.getProcesso().get(i).getCliente().setIdade(idade);
				rep.getProcesso().get(i).getData().setDia(dia);
				rep.getProcesso().get(i).getData().setMes(mes);
				rep.getProcesso().get(i).getData().setAno(ano);
				
				
				
				
				Alert alertAlterado = new Alert(Alert.AlertType.INFORMATION);
				alertAlterado.setTitle("Alterado");
				alertAlterado.setContentText("O cadastro foi alterado Com sucesso");
				alertAlterado.showAndWait();
				break;
		}
	}}
	
	
	public void cancelar() {
		try {

			 FXMLLoader loader = new FXMLLoader(getClass().getResource("telaInicial.fxml")); 
			 AnchorPane root = loader.load(); 
			 Scene scene = new Scene (root);
			 Stage primaryStage= (Stage) alterarScene.getScene().getWindow();
			 primaryStage.setScene(scene);
			 
			 
				}catch (IOException e) {
					e.printStackTrace();
				}
	}
	
}
