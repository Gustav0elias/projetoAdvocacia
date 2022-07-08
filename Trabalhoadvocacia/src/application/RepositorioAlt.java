package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RepositorioAlt {

	Repositorio rep = new Repositorio();
	
	private final ObservableList<Processo> listProcessos;
	
	public RepositorioAlt() {
		this.listProcessos = FXCollections.observableArrayList();
	}
	public void inserir (Processo p)
	{
		listProcessos.add(p);
	}
		

	public ObservableList<Processo> getListProcessos() {
		return listProcessos;
	}

	

	
}
