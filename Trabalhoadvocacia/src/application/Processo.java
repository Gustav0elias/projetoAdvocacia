package application;

public abstract class Processo {

	
	protected int idade_abertura;
	protected String responsavel;
	protected int codigo;
	protected Cliente cliente;
	

	
	
	public Processo(int idade_abertura, String responsavel, int codigo) {
		super();
		this.idade_abertura = idade_abertura;
		this.responsavel = responsavel;
		this.codigo = codigo;
	
	}
	public Integer getIdade_abertura() {
		return idade_abertura;
	}
	public void setIdade_abertura(Integer idade_abertura) {
		this.idade_abertura = idade_abertura;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return  idade_abertura +  responsavel+ codigo
				;
	}
	
	
}
