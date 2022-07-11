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

public class telaRemoverController {
	
	@FXML 
	private Button botaoInserir;
	

	@FXML
	private AnchorPane removerScene;
	
	@FXML
	private TextField txfRemover;
	Repositorio rep = new Repositorio();
	public void cancelar() {
		try {

			 FXMLLoader loader = new FXMLLoader(getClass().getResource("telaInicial.fxml")); 
			 AnchorPane root = loader.load(); 
			 Scene scene = new Scene (root);
			 Stage primaryStage= (Stage) removerScene.getScene().getWindow();
			 primaryStage.setScene(scene);
			 
			 
				}catch (IOException e) {
					e.printStackTrace();
				}
	}
	
	public void remover() {
		
		String cpfRemover = txfRemover.getText();
		
		for (int i =0; i< rep.getProcesso().size(); i++) {
			if ( cpfRemover.equals(rep.getProcesso().get(i).getCliente().getCpf())) {
			rep.getProcesso().remove(i);
			
			Alert alertRemovido = new Alert(Alert.AlertType.INFORMATION);
			alertRemovido.setTitle("Removido");
			alertRemovido.setContentText("O cadastro foi removido com sucesso");
			alertRemovido.showAndWait();
			break;
			}
			else {
				Alert alertRemover = new Alert(Alert.AlertType.WARNING);
				alertRemover.setTitle("ERRO NO REMOVER");
				alertRemover.setContentText("Esse cpf não está cadastrado no nosso banco de dados");
				alertRemover.showAndWait();
					
			}
		}
		/*Processo processoRemover = new Comum();
	
		String cpfRemover = txfRemover.getText();
		
		if (processoRemover.getCliente().getCpf().equals(cpfRemover)) {
		
		rep.remover(processoRemover);
		} */
	}
	
	/*  	System.out.println("Qual elemento vocÃª deseja remover? (CPF)");
				read.nextLine();
				String cpfe = read.nextLine();
				rep.remover(cpfe); 
				
				*
		public void remover (String p) {
			
			for (int i = 0; i<listaProcesso.size(); i++) {
				
				Processo processom= this.listaProcesso.get(i);
				if (processom.getCliente().getCpf().equals(processom)) {
					listaProcesso.remove(i);
				}
			}
		}
	
				*/
	
	
}

