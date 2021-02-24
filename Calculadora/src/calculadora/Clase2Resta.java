package calculadora;

import java.util.Scanner;

/**
 * Esta clase permite realizar diferentes operaciones de resta:
 * <ul>
 * <li>Resta de dos números reales</li>
 * <li>Resta de dos números enteros</li>
 * <li>Resta de tres números reales</li>
 * <li>Resta recurrente</li>
 * </ul>
 * 
 * @author Alfonso
 * @since 24/01/2021
 */

public class Clase2Resta {

	/**
	 * Método que retorna la resta de dos números reales.
	 * 
	 * @param a Número real correspondiente con el minuendo
	 * @param b Número real correspondiente con el sustraendo
	 * @return Retorna la resta de los números introducidos según la fórmula: a - b
	 */

	public static double restaNumReal(double a, double b) {
		double min = a;
		double sust = b;

		return min - sust;
	}

	/**
	 * Método que retorna la resta de dos números enteros.
	 * 
	 * @param a Número entero correspondiente con el minuendo
	 * @param b Número entero correspondiente con el sustraendo
	 * @return Retorna la resta de los dos números introducidos según la fórmula: a
	 *         - b
	 */

	public static int restaNumEnt(int a, int b) {
		int min = a;
		int sust = b;

		return min - sust;
	}

	/**
	 * Método que retorna la resta de tres números reales.
	 * 
	 * @param a Número real correspondiente con el minuendo
	 * @param b Número real correspondiente con el primer sustraendo
	 * @param c Número real correspondiente con el segundo sustraendo
	 * @return Retorna la resta de los tres números introducidos según la fórmula:
	 *         (a - b) - c
	 */

	public static double restaNumReal(double a, double b, double c) {
		double min = a;
		double sust1 = b;
		double sust2 = c;

		return (min - sust1) - sust2;
	}

	/**
	 * Método que acumula los números introducidos a través del método acumular.<br>
	 * 
	 * Se introducirán los números por consola hasta que se quiera salir del
	 * acumulador, para lo que se deberá introducir el caracter 0.<br>
	 * <br>
	 * 
	 * <b>Atención</b>
	 * Para introducir decimales se debe utilizar el carácter "," (ej. 12345,6485)
	 */

	public static double acumular() {
		Scanner sc = new Scanner(System.in);
		double numero = 0;
		double acumulado = 0;

		System.out.println("Introduce el primer número que quieres añadir al acumulador.....");
		numero = sc.nextDouble();
		acumulado += numero;

		while (numero != 0) {
			System.out.println(
					"Introduce otro número para sumar o restar (con signo - delante) al acumulador si quieres salir introduce el 0....");
			numero = sc.nextDouble();
			acumulado += numero;
		}

		sc.close();

		return acumulado;

	}

}
