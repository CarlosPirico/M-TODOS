package models;

public class Maior {
	// criando atributo.
	// int array
	private int[] numero;
	
	// criando o construtor.
	public Maior(int[] numero) {
		this.numero = numero;
	}
	
	// metodo para retornar o maior numeor do array.
	public int getMaior() {
		// declarando o maior numero o primeiro da lista.
		int maior = numero[0];
		// for com a quantidade de numeros digitados no array
		for(int i = 0; i <= (numero.length - 1); i++) {
			// validando se o numero é maior, caso sim ele substitui o dado
			if(maior < numero[i]) {
				maior = numero[i];
			}
		}
		// retornando o maior numero do array.
		return maior;
	}
	
	// retornar sequencia de numeros dentro do array.
	public String getNumeros() {
		String returnNumero = "Numeros digitados são: ";
		for(int i = 0; i <= (numero.length - 1); i++) {
			returnNumero += "(" + numero[i] + ") ";
		}
		return returnNumero;
	}
}
