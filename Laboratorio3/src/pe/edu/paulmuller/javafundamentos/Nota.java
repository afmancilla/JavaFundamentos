package pe.edu.paulmuller.javafundamentos;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		String resultado;
		int nota;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese su nota del 1 al 20:");
		nota = teclado.nextInt();

		if (nota >= 18) {
			resultado = "Sobresaliente";
		} else if (nota >= 16 && nota <= 17) {
			resultado = "Notable";
		} else if (nota >= 12 && nota <= 15) {
			resultado = "Bien";
		} else if (nota >= 10 && nota <= 11) {
			resultado = "Suficiente";
		} else {
			resultado = "Insuficiente";
		}

		System.out.print("Su nota es :" + resultado);
	}
}
