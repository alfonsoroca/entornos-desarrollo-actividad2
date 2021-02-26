package calculadora;

import java.util.Scanner;

/**
 * Esta clase permite realizar diferentes operaciones de resta:
 * <ul>
 * <li>Resta de dos n�meros reales</li>
 * <li>Resta de dos n�meros enteros</li>
 * <li>Resta de tres n�meros reales</li>
 * <li>Resta recurrente</li>
 * </ul>
 * 
 * @author Alfonso
 * @since 24/01/2021
 */

public class Clase2Resta {

	/**
	 * M�todo que retorna la resta de dos n�meros reales.
	 * 
	 * @param a N�mero real correspondiente con el minuendo
	 * @param b N�mero real correspondiente con el sustraendo
	 * @return Retorna un {@code double} con el valor de la resta de los n�meros introducidos seg�n la f�rmula: a - b
	 */

	public static double restaNumReal(double a, double b) {
		double min = a;
		double sust = b;

		return min - sust;
	}

	/**
	 * M�todo que retorna la resta de dos n�meros enteros.
	 * 
	 * @param a N�mero entero correspondiente con el minuendo
	 * @param b N�mero entero correspondiente con el sustraendo
	 * @return Retorna un {@code int} con el valor de la resta de los dos n�meros introducidos seg�n la f�rmula: a
	 *         - b
	 */

	public static int restaNumEnt(int a, int b) {
		int min = a;
		int sust = b;

		return min - sust;
	}

	/**
	 * M�todo que retorna la resta de tres n�meros reales.
	 * 
	 * @param a N�mero real correspondiente con el minuendo
	 * @param b N�mero real correspondiente con el primer sustraendo
	 * @param c N�mero real correspondiente con el segundo sustraendo
	 * @return Retorna un {@code double} con el valor de la resta de los tres n�meros introducidos seg�n la f�rmula:
	 *         (a - b) - c
	 */

	public static double restaNumReal(double a, double b, double c) {
		double min = a;
		double sust1 = b;
		double sust2 = c;

		return (min - sust1) - sust2;
	}

	/**
	 * M�todo que acumula los n�meros introducidos a trav�s del m�todo acumular.<br>
	 * 
	 * Se introducir�n los n�meros por consola hasta que se quiera salir del
	 * acumulador, para lo que se deber� introducir el caracter 0.<br>
	 * <br>
	 * 	<b>Atenci�n</b>
	 * Para introducir decimales se debe utilizar el car�cter "," (ej. 12345,6485)
	 * 
	 * @return Retorna un {@code double} con el valor acumulado de todos los n�meros introducidos
	 */

	public static double acumular() {
		Scanner sc = new Scanner(System.in);
		double numero = 0;
		double acumulado = 0;

		System.out.println("Introduce el primer n�mero que quieres a�adir al acumulador (el car�cter decimal es la coma).....");
		numero = sc.nextDouble();
		acumulado += numero;

		while (numero != 0) {
			System.out.println(
					"Introduce otro n�mero (el car�cter decimal es la coma) para sumar o restar (resta con signo - delante) al acumulador, si quieres salir introduce el 0....");
			numero = sc.nextDouble();
			acumulado += numero;
		}

		sc.close();

		return acumulado;

	}

}
