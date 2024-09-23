package models;

public class Unir {
	// criando os atributos.
	private Integer a;
	private Integer b;
	
	// criando construtor.
	public Unir(Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}
	
	// metodo para mostrar numeros digitados.
	public String getNumeroDigitados(){
		return "Numeros digitados é " + a + " e " + b;
	}
	
	// metodos para unir dois numeros.
	public String unir() {
		return a.toString() + b.toString();
	}
}
