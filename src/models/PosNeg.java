package models;

public class PosNeg {
	// criando atributo.
	private Integer numero;
	// criando construtor.
	public PosNeg(Integer n) {
		this.numero = n;
	}
	// metodo para validar numero igual a positivo ou negativo e considerando 0 positivo
	public String validarNumero() {
		if(numero >= 0) {
			return "Positivo";			
		} else {
			return "Negativo";			
		}
	}
	// metodo para mostrar numero.
	public Integer getNumero() {
		return numero;
	}
}
