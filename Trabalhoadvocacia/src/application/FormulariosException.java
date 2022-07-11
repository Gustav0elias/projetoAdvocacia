package application;

import java.util.HashMap;
import java.util.Map;

public class FormulariosException extends RuntimeException {

	public FormulariosException (String mensagem) {
		super(mensagem);
	}

	public void addError (String nomeErro, String mensagemErro) {
		
	}
	
}
