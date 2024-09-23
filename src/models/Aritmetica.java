package models;

public class Aritmetica {
	// criando atributos.
	private Double numero1;
	private Double numero2;
	private Double numero3;
	//criando construtor.
	public Aritmetica(Double n1, Double n2, Double n3) {
		this.numero1 = n1;
		this.numero2 = n2;
		this.numero3 = n3;
	}
	// metodo para calcular média entre os 3 atributos.
	public Double media() {
		return (numero1+numero2+numero3) / 3;
	}
	// metodo para mostar todos os atributos.
	public String toString() {
		return "Numeros digitados são: (" + numero1 + ", " + numero2 + ", " + numero3 + ")";
	}
}
