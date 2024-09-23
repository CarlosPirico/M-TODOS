package models;

public class Maior {
	private int[] numero;
	
	public Maior(int[] numero) {
		this.numero = numero;
	}
	
	public int getMaior() {
		int maior = numero[0];
		for(int i = 0; i <= (numero.length - 1); i++) {
			if(maior < numero[i]) {
				maior = numero[i];
			}
		}
		return maior;
	}
	
	public String getNumeros() {
		String returnNumero = "Numeros digitados são: ";
		for(int i = 0; i <= (numero.length - 1); i++) {
			returnNumero += "(" + numero[i] + ") ";
		}
		return returnNumero;
	}
}
