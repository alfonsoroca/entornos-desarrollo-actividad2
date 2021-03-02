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
 * <br>
 * Casos especiales
 * <ul>
 * <li>Cualquier número entero o real al que se le resta +infinito da como
 * resultado -infinito</li>
 * <li>Cualquier número entero o real al que se le resta -infinito da como
 * resultado +infinito</li>
 * <li>Cuando el minuendo es +infinito y se le resta cualquier número entero o
 * real da como resultado +infinito</li>
 * <li>Cuando el minuendo es -infinito y se le resta cualquier número entero o
 * real da como resultado -infinito</li>
 * <li>Cuando el minuendo es +infinito y se le resta +infinito da como resultado
 * NaN</li>
 * <li>Cuando el minuendo es -infinito y se le resta -infinito da como resultado
 * NaN</li>
 * <li>Cuando el minuendo es +infinito y se le resta -infinito da como resultado
 * +infinito</li>
 * <li>Cuando el minuendo es -infinito y se le resta +infinito da como resultado
 * -infinito</li>
 * <li>Cuando el resultado de las operaciones de cualquier método excede el
 * valor máximo/mínimo admitido por el tipo de dato, aparece un mensaje de aviso
 * y se retorna el valor máximo/mínimo admitido por el tipo de dato</li>
 * </ul>
 * 
 * @author Alfonso
 * @since 24/01/2021
 */

public class Clase2Resta {

	/**
	 * Método que retorna la resta de dos números reales
	 * 
	 * @param a Número real correspondiente con el minuendo
	 * @param b Número real correspondiente con el sustraendo
	 * @return Retorna un {@code double} con el valor de la resta de los números
	 *         introducidos según la fórmula: a - b <br>
	 *         <br> 
	 *         Casos especiales
	 *         <ul>
	 *         <li>Cualquier número entero o real al que se le resta +infinito da
	 *         como resultado -infinito</li>
	 *         <li>Cualquier número entero o real al que se le resta -infinito da
	 *         como resultado +infinito</li>
	 *         <li>Cuando el minuendo es +infinito y se le resta cualquier número
	 *         entero o real da como resultado +infinito</li>
	 *         <li>Cuando el minuendo es -infinito y se le resta cualquier número
	 *         entero o real da como resultado -infinito</li>
	 *         <li>Cuando el minuendo es +infinito y se le resta +infinito da como
	 *         resultado NaN</li>
	 *         <li>Cuando el minuendo es -infinito y se le resta -infinito da como
	 *         resultado NaN</li>
	 *         <li>Cuando el minuendo es +infinito y se le resta -infinito da como
	 *         resultado +infinito</li>
	 *         <li>Cuando el minuendo es -infinito y se le resta +infinito da como
	 *         resultado -infinito</li>
	 *         <li>Cuando el resultado de las operaciones de cualquier método excede
	 *         el valor máximo/mínimo admitido por el tipo de dato, aparece un
	 *         mensaje de aviso y se retorna el valor máximo/mínimo admitido por el
	 *         tipo de dato</li>
	 *         </ul>
	 */

	public static double restaNumReal(double a, double b) {
		// Utilizamos tipos float para controlar el overflow
		float min = (float) a;
		float sust1 = (float) b;
		float resultado = min - sust1;

		if (resultado > Double.MAX_VALUE) {
			System.out.println("Error producido por superar el valor máximo permitido:");
			return Double.MAX_VALUE;

		} else if (resultado < -Double.MAX_VALUE) {
			System.out.println("Error producido por superar el valor mínimo permitido:");
			return -Double.MAX_VALUE;

		} else
			return (double) resultado;
	}

	/**
	 * Método que retorna la resta de dos números enteros
	 * 
	 * @param a Número entero correspondiente con el minuendo
	 * @param b Número entero correspondiente con el sustraendo
	 * @return Retorna un {@code int} con el valor de la resta de los dos números
	 *         introducidos según la fórmula: a - b <br>
	 *         <br> 
	 *         Casos especiales
	 *         <ul>
	 *         <li>Cualquier número entero o real al que se le resta +infinito da
	 *         como resultado -infinito</li>
	 *         <li>Cualquier número entero o real al que se le resta -infinito da
	 *         como resultado +infinito</li>
	 *         <li>Cuando el minuendo es +infinito y se le resta cualquier número
	 *         entero o real da como resultado +infinito</li>
	 *         <li>Cuando el minuendo es -infinito y se le resta cualquier número
	 *         entero o real da como resultado -infinito</li>
	 *         <li>Cuando el minuendo es +infinito y se le resta +infinito da como
	 *         resultado NaN</li>
	 *         <li>Cuando el minuendo es -infinito y se le resta -infinito da como
	 *         resultado NaN</li>
	 *         <li>Cuando el minuendo es +infinito y se le resta -infinito da como
	 *         resultado +infinito</li>
	 *         <li>Cuando el minuendo es -infinito y se le resta +infinito da como
	 *         resultado -infinito</li>
	 *         <li>Cuando el resultado de las operaciones de cualquier método excede
	 *         el valor máximo/mínimo admitido por el tipo de dato, aparece un
	 *         mensaje de aviso y se retorna el valor máximo/mínimo admitido por el
	 *         tipo de dato</li>
	 *         </ul>
	 */

	public static int restaNumEnt(int a, int b) {
		// Utilizamos tipos long para controlar el overflow
		long min = (long) a;
		long sust = (long) b;
		long resultado = min - sust;

		if (resultado > Integer.MAX_VALUE) {
			System.out.println("Error producido por superar el valor máximo permitido:");
			return Integer.MAX_VALUE;

		} else if (resultado < Integer.MIN_VALUE) {
			System.out.println("Error producido por superar el valor mínimo permitido:");
			return Integer.MIN_VALUE;

		} else
			return (int) resultado;
	}

	/**
	 * Método que retorna la resta de tres números reales
	 * 
	 * @param a Número real correspondiente con el minuendo
	 * @param b Número real correspondiente con el primer sustraendo
	 * @param c Número real correspondiente con el segundo sustraendo
	 * @return Retorna un {@code double} con el valor de la resta de los tres
	 *         números introducidos según la fórmula: (a - b) - c <br>
	 *         <br> 
	 *         Casos especiales
	 *         <ul>
	 *         <li>Cualquier número entero o real al que se le resta +infinito da
	 *         como resultado -infinito</li>
	 *         <li>Cualquier número entero o real al que se le resta -infinito da
	 *         como resultado +infinito</li>
	 *         <li>Cuando el minuendo es +infinito y se le resta cualquier número
	 *         entero o real da como resultado +infinito</li>
	 *         <li>Cuando el minuendo es -infinito y se le resta cualquier número
	 *         entero o real da como resultado -infinito</li>
	 *         <li>Cuando el minuendo es +infinito y se le resta +infinito da como
	 *         resultado NaN</li>
	 *         <li>Cuando el minuendo es -infinito y se le resta -infinito da como
	 *         resultado NaN</li>
	 *         <li>Cuando el minuendo es +infinito y se le resta -infinito da como
	 *         resultado +infinito</li>
	 *         <li>Cuando el minuendo es -infinito y se le resta +infinito da como
	 *         resultado -infinito</li>
	 *         <li>Cuando el resultado de las operaciones de cualquier método excede
	 *         el valor máximo/mínimo admitido por el tipo de dato, aparece un
	 *         mensaje de aviso y se retorna el valor máximo/mínimo admitido por el
	 *         tipo de dato</li>
	 *         </ul>
	 */

	public static double restaNumReal(double a, double b, double c) {
		// Utilizamos tipos float para controlar el overflow
		float min = (float) a;
		float sust1 = (float) b;
		float sust2 = (float) c;
		float resultado = (min - sust1) - sust2;

		if (resultado > Double.MAX_VALUE) {
			System.out.println("Error producido por superar el valor máximo permitido:");
			return Double.MAX_VALUE;

		} else if (resultado < -Double.MAX_VALUE) {
			System.out.println("Error producido por superar el valor mínimo permitido:");
			return -Double.MAX_VALUE;

		} else
			return (double) resultado;
	}

	/**
	 * Método que acumula los números introducidos<br>
	 * <br>
	 * 
	 * Se introducirán los números por consola hasta que se quiera salir del
	 * acumulador, para lo que se deberá introducir el caracter 0.<br>
	 * <br>
	 * <b>Atención</b> Para introducir decimales se debe utilizar el carácter ","
	 * (ej. 12345,6485)
	 * 
	 * @return Retorna un {@code double} con el valor acumulado de todos los números
	 *         introducidos <br>
	 *         <br> 
	 *         Casos especiales
	 *         <ul>
	 *         <li>Cualquier número entero o real al que se le resta +infinito da
	 *         como resultado -infinito</li>
	 *         <li>Cualquier número entero o real al que se le resta -infinito da
	 *         como resultado +infinito</li>
	 *         <li>Cuando el minuendo es +infinito y se le resta cualquier número
	 *         entero o real da como resultado +infinito</li>
	 *         <li>Cuando el minuendo es -infinito y se le resta cualquier número
	 *         entero o real da como resultado -infinito</li>
	 *         <li>Cuando el minuendo es +infinito y se le resta +infinito da como
	 *         resultado NaN</li>
	 *         <li>Cuando el minuendo es -infinito y se le resta -infinito da como
	 *         resultado NaN</li>
	 *         <li>Cuando el minuendo es +infinito y se le resta -infinito da como
	 *         resultado +infinito</li>
	 *         <li>Cuando el minuendo es -infinito y se le resta +infinito da como
	 *         resultado -infinito</li>
	 *         <li>Cuando el resultado de las operaciones de cualquier método excede
	 *         el valor máximo/mínimo admitido por el tipo de dato, aparece un
	 *         mensaje de aviso y se retorna el valor máximo/mínimo admitido por el
	 *         tipo de dato</li>
	 *         </ul>
	 */

	public static double acumular() {
		Scanner sc = new Scanner(System.in);
		// Utilizamos tipos float para controlar el overflow
		float numero = 0;
		float acumulado = 0;

		System.out.println(
				"Introduce el primer número que quieres añadir al acumulador (el carácter decimal es la coma).....");
		numero = sc.nextFloat();
		acumulado += numero;

		while (numero != 0) {
			System.out.println(
					"Introduce otro número (el carácter decimal es la coma) para sumar o restar (resta con signo - delante) al acumulador, si quieres salir introduce el 0 y te mostré el valor acumulado....");
			numero = sc.nextFloat();
			acumulado += numero;
		}

		sc.close();

		if (acumulado > Double.MAX_VALUE) {
			System.out.println("Error producido por superar el valor máximo permitido:");
			return Double.MAX_VALUE;

		} else if (acumulado < -Double.MAX_VALUE) {
			System.out.println("Error producido por superar el valor mínimo permitido:");
			return -Double.MAX_VALUE;

		} else
			return (double) acumulado;

	}

}
