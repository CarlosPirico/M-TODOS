package models;

public class Minuto {
	// criando atributo.
	private int minuto;
	// criando contrutor.
	public Minuto(int minuto) {
		this.minuto = minuto;
	}

	public String calcHoras() {
		// divindo minutos por 60 para saber quantas horas. 
		int horas = minuto / 60;
		// pegando o restante da divisão para sabermos os minutos restantes.
		int minutosSobra = minuto % 60;
		
		return horas + " horas e " + minutosSobra + " minutos";
	}
	// mostrar minutos.
	public int getMinuto() {
		return minuto;
	}
}
