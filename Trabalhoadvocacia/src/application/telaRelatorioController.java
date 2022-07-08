package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class telaRelatorioController implements Initializable{


	
	@FXML
	private TableView   <Processo> tabelaProcessos;
	@FXML
	private TableColumn <Processo, Integer> colAbertura;
	@FXML
	private TableColumn <Processo, String>colResponsavel;
	@FXML
	private TableColumn <Processo, String>colCodigo;
	@FXML
	private TableColumn <Processo, String>colNome;
	@FXML
	private TableColumn <Processo, String>colCpf;
	@FXML
	private TableColumn <Processo, Integer> colIdade;
	
	@FXML
	private AnchorPane relatorioScene;
	
	/* private List <Processo> listClientes;
	 ObservableList<Processo> obslistProcesso; */
	

			 
	Repositorio rep = new Repositorio(); 
   RepositorioAlt rep1 = new RepositorioAlt();
 
	

	
   
	public void cancelar () {
		try {

			 FXMLLoader loader = new FXMLLoader(getClass().getResource("telaInicial.fxml")); 
			 AnchorPane root = loader.load(); 
			 Scene scene = new Scene (root);
			 Stage primaryStage= (Stage) relatorioScene.getScene().getWindow();
			 primaryStage.setScene(scene);
			 
			 
				}catch (IOException e) {
					e.printStackTrace();
				}
	}
	
	 ObservableList<Processo> obslistProcesso  = FXCollections.observableArrayList(rep.getProcesso());
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		

		 colAbertura.setCellValueFactory(new PropertyValueFactory<> ("idade_abertura"));
		 colResponsavel.setCellValueFactory(new PropertyValueFactory<> ("responsavel"));
		 colCodigo.setCellValueFactory(new PropertyValueFactory<> ("codigo"));
			tabelaProcessos.setItems(obslistProcesso);
			
			
		/*ArrayList <Processo> listap = rep.getProcesso();
		ObservableList<Processo> conteudo = FXCollections.observableArrayList(listap);	
		 colAbertura.setCellValueFactory(new PropertyValueFactory<> ("idade_abertura"));
		 colResponsavel.setCellValueFactory(new PropertyValueFactory<> ("responsave"));
		 colCodigo.setCellValueFactory(new PropertyValueFactory<> ("codigo"));
		 colNome.setCellValueFactory(new PropertyValueFactory<> ("nome"));
		 colCpf.setCellValueFactory(new PropertyValueFactory<> ("cpf"));
		 colIdade.setCellValueFactory(new PropertyValueFactory<> ("idade"));
		 tabelaProcessos.setItems(conteudo);*/
	
		
	}
	
	
	
	/*	private void tabelaProcessos () {
		
		ObservableList<Processo> conteudo = FXCollections.observableArrayList(listap);	
	 colAbertura.setCellValueFactory(new PropertyValueFactory<> ("idade_abertura"));
	 colResponsavel.setCellValueFactory(new PropertyValueFactory<> ("responsave"));
	 colCodigo.setCellValueFactory(new PropertyValueFactory<> ("codigo"));
	 colNome.setCellValueFactory(new PropertyValueFactory<> ("nome"));
	 colCpf.setCellValueFactory(new PropertyValueFactory<> ("cpf"));
	 colIdade.setCellValueFactory(new PropertyValueFactory<> ("idade"));
	 tabelaProcessos.setItems(conteudo);
	}
	
	 */
}
