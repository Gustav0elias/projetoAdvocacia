package application;

public class Criminal extends Processo {
	private int numero_vara;
	
	public Criminal(int idade_abertura, String responsavel, int codigo, int numero_vara, Cliente cliente, Data data) {
		super(idade_abertura, responsavel, codigo, cliente, data);
		this.numero_vara = numero_vara;
	}

	

	
}
