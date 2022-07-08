package application;

import java.util.ArrayList;




public class Repositorio {

	
	ArrayList <Processo> listaProcesso;
	
	public Repositorio() {
		
		listaProcesso = new ArrayList<Processo>();
		
	}
	
	public void inserir (Processo p)
	{
		listaProcesso.add(p);
		
		
  }
	
	public void mostrarRelatorio () {
		for (Processo processo : listaProcesso) {
			System.out.println(processo.getCodigo());
		}
		
	
	}
	
	/*public void remover (String r) {
		for (int i=0; i<listaProcesso.size(); i++) {
			
			Processo processo = this.listaProcesso.get(i);
			if (processo.getCliente().getCpf().equals(r)) {
				listaProcesso.remove(i);
			}
			
			else {
				System.out.println("Esse CPF não está cadastrado no sistema");
			}
		}
	}*/
	
	public ArrayList <Processo> getProcesso() {
		return listaProcesso;
	}
	
	}
	
	
