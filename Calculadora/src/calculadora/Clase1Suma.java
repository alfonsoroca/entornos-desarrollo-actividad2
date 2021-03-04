package calculadora;

import java.util.Scanner;

/**
 * <li>Esta clase permite realizar diferentes operaciones de tipo suma:</li>
 * <ul>
 * <li>Suma de dos números reales</li>
 * <li>Suma de dos números enteros</li>
 * <li>Suma de tres números reales</li>
 * <li>Suma acumulativa</li>
 * </ul>
 * 
 * <li> Casos Especiales </li>
 * <ul>
 * <li>Cualquier número entero o real al que se le suma +infinito da como resultado +infinito</li>
 * <li>Cualquier número entero o real al que se le suma -infinito da como resultado -infinito</li>
 * <li>Cualquier suma empleando en los sumandos valores de +infinito y -infinito dan como resultado un valor NaN </li>
 * </ul>
 * <br>
 * 
 * @author Alfonso, Estanislao, Rafael
 * @since 24/01/2021
 * 
 * Clase realizada por @Rafa tras la unificación de grupos
 */

public class Clase1Suma {
	static double acumulador = 0;

	/**
	 * <b>Método sumaNumReal</b> que retorna la suma de dos números reales.
	 * 
	 * @param sum1 Número real correspondiente con el primer sumando
	 * @param sum2 Número real correspondiente con el segundo sumando
	 * @return Retorna la suma de los dos sumandos introducidos según la fórmula:
	 *         sum1 + sum2
	 *         <ul>
	 *         <li>Cualquier número entero o real al que se le suma +infinito da
	 *         como resultado +infinito</li>
	 *         <li>Cualquier número entero o real al que se le suma -infinito da
	 *         como resultado -infinito</li>
	 *         <li>Cualquier suma empleando en los sumandos valores de +infinito y
	 *         -infinito dan como resultado un valor NaN</li>
	 *         <li>Si cualquiera de los sumandos en NaN. el resultado será NaN</li>
	 *         </ul>
	 * 
	 */

	public static double sumaNumReal(double sum1, double sum2) {
		// Utilizamos tipos float para controlar el overflow
		double sumador1 = sum1;
		double sumador2 = sum2;
		double resultado = sumador1 + sumador2;

		if (resultado > Double.MAX_VALUE) {
			System.out.println("Error producido por superar el valor máximo permitido:");
			return Double.POSITIVE_INFINITY;

		} else if (resultado < -Double.MAX_VALUE) {
			System.out.println("Error producido por superar el valor mínimo permitido:");
			return Double.NEGATIVE_INFINITY;

		} else {
			return resultado;
		}

	}

	

	/**
	 * <b>Método sumaNumEnt</b> que retorna la suma de dos números enteros.
	 * @param sum1 Número entero correspondiente con el primer sumando
	 * @param sum2 Número entero correspondiente con el segundo sumando
	 * @return Retorna la suma de los dos sumandos introducidos según la fórmula: sum1 + sum2
	 * 
	 *         <ul>
	 *         <li>Si el resultado es mayor que {@value Integer#MAX_VALUE}, 
	 *         devolverá {@value Integer#MAX_VALUE}</li>
	 *         <li>Si el resultado es menor que {@value Integer#MIN_VALUE}, 
	 *         devolverá {@value Integer#MIN_VALUE}</li>
	 *         </ul>
	 */

	public static int sumaNumEnt(int sum1, int sum2) {

		// Utilizamos tipos Long para controlar el overflow de los int
		long sumador1 = (long) sum1;
		long sumador2 = (long) sum2;
		long resultado = sumador1 + sumador2;

		if (resultado > Integer.MAX_VALUE) {
			System.out.println("Error producido por superar el valor máximo permitido:");
			return Integer.MAX_VALUE;

		} else if (resultado < -Integer.MIN_VALUE) {
			System.out.println("Error producido por superar el valor mínimo permitido:");
			return (int) Integer.MIN_VALUE;

		} else
			return (int) resultado;
	}

	/**
	 * Método que retorna la suma de tres números reales.
	 * 
	 * @param sum1 Número real correspondiente con el primer sumando
	 * @param sum2 Número real correspondiente con el segundo sumando
	 * @param sum3 Número real correspondiente con el tercer sumando
	 * @return Retorna la suma de los tres sumandos introducidos según la fórmula:
	 *         sum1 + sum2 + sum3
	 * 
	 *         <ul>
	 *         <li>Cualquier número entero o real al que se le suma +infinito da
	 *         como resultado +infinito</li>
	 *         <li>Cualquier número entero o real al que se le suma -infinito da
	 *         como resultado -infinito</li>
	 *         <li>Cualquier suma empleando en los sumandos valores de +infinito y
	 *         -infinito dan como resultado un valor NaN</li>
	 *         <li>Si cualquiera de los sumandos en NaN. el resultado será NaN</li>
	 *         </ul>
	 */

	public static double sumaNumReal(double sum1, double sum2, double sum3) {
		// Utilizamos tipos float para controlar el overflow
				float sumador1 = (float) sum1;
				float sumador2 = (float) sum2;
				float sumador3 = (float) sum3;
				float resultado = sumador1 + sumador2 + sumador3;

				if (resultado > Double.MAX_VALUE) {
					System.out.println("Error producido por superar el valor máximo permitido:");
					return Double.POSITIVE_INFINITY;

				} else if (resultado < -Double.MAX_VALUE) {
					System.out.println("Error producido por superar el valor mínimo permitido:");
					return Double.NEGATIVE_INFINITY;

				} else
					return (double) resultado;
	}
	
	/**
	 * Método para sumar acumulativamente diferentes números reales
	 * @param sumador Número real que se quiere añadir al sumatorio
	 * @param acumulador almacenamos el valor del sumatorio de todos los 
	 * números introducidos
	 *         <ul>
	 *         <li>Cualquier número entero o real al que se le suma +infinito da
	 *         como resultado +infinito</li>
	 *         <li>Cualquier número entero o real al que se le suma -infinito da
	 *         como resultado -infinito</li>
	 *         <li>Cualquier suma empleando en los sumandos valores de +infinito y
	 *         -infinito dan como resultado un valor NaN</li>
	 *         </ul>
	 */

	public static double sumatorio(double sumador) {
		acumulador += sumador;
		return acumulador;
	}

	/**
	 * Devuelve el valor actual del campo {@link Clase1Suma#acumulador}
	 * @return El valor del campo {@link Clase1Suma#acumulador}
	 */
	public static double getAcumulador() {
		return acumulador;
	}

	/**
	 * Pone el valor del campo {@link Clase1Suma#acumulador} a 0.
	 */
	public static void resetAcumulador() {
		acumulador = 0;
	}
}