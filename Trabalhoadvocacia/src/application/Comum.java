package application;

public class Comum extends Processo{

	public Comum() {}
	
	public Comum( Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Comum(int idade_abertura, String responsavel, int codigo, Cliente cliente, Data data) {
		super(idade_abertura, responsavel, codigo, cliente, data);
		// TODO Auto-generated constructor stub
	}

	
	
}
