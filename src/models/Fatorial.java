package models;

public class Fatorial {
	// criando atributo.
	private int numero;
	
	// criando construtor.
	public Fatorial(int numero) {
		this.numero = numero;
	}
	
	public int getCalcFatorial() {
		// numero base para multiplicação.
		int result = 1;
		// multiplicando e diminundo o indice.
		for (int i = numero; i >= 1; i--) {
			result *= i;
		}
		// resultado da fatorial.
		return result;
	}
	
	// mostrar numero fatorado.
	public String getNumeroFac() {
		return numero + "!";
	}
}
