package app;
import models.*;
public class Main {

	public static void main(String[] args) {
		// Positivo e negativo.
		PosNeg numero1 = new PosNeg(5);
		PosNeg numero2 = new PosNeg(-1);
		System.out.println("Numero "+numero1.getNumero()+" é: " + numero1.validarNumero() + "\nNumero "+ numero2.getNumero() +" é: " + numero2.validarNumero() + "\n");

		// Calcular aritmetica.
		Aritmetica numeros3 = new Aritmetica(5.4,6.7,8.1);
		System.out.println(numeros3.toString());
		System.out.printf("Média aritmetica dos numeros é: %,.2f\n\n", numeros3.media());
		
		// Maior numero.
		int[] numerosMaior = {4,5,1};
		Maior numeroMaior = new Maior(numerosMaior);
		System.out.println(numeroMaior.getNumeros());
		System.out.println("E o maior numero digitado é: " + numeroMaior.getMaior() + "\n");
		
		// Unir numeros ex ab.
		Unir numeros4 = new Unir(105,667);
		System.out.println(numeros4.getNumeroDigitados() + " e unidos o resultado é: " + numeros4.unir() + "\n");
		
		// Calcular horas.
		Minuto minuto = new Minuto(1568);
		System.out.println(minuto.getMinuto() + " minutos são: " + minuto.calcHoras() + "\n");
		
		// Calcular fatorial.
		Fatorial numero5 = new Fatorial(5);
		System.out.println(numero5.getNumeroFac() + " é igual a: " + numero5.getCalcFatorial());
	}

}
