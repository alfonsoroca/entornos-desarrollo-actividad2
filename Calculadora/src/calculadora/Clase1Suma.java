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
 * <li>Casos Especiales</li>
 * <ul>
 * <li>Cualquier número entero o real al que se le suma +infinito da como
 * resultado +infinito</li>
 * <li>Cualquier número entero o real al que se le suma -infinito da como
 * resultado -infinito</li>
 * <li>Cualquier suma empleando en los sumandos valores de +infinito y -infinito
 * dan como resultado un valor NaN</li>
 * </ul>
 * <br>
 * <b>ATENCIóN:</b> Para operar con números decimales usar la ","!!
 * <p>
 * <b>ATENCIÓN</b> No emplear numeros negativos para realizar los calculos!!!
 * <p>
 * 
 * @author Alfonso, Estanislao, Rafael
 * @since 24/01/2021
 * 
 *        Clase realizada por @Rafa tras la unificación de grupos
 */

public class Clase1Suma {

	/**
	 * <b>Método sumaNumReal</b> que retorna la suma de dos números reales.
	 * 
	 * @param sum1 Número real correspondiente con el primer sumando
	 * @param sum2 Número real correspondiente con el segundo sumando
	 * @return Retorna la suma de los dos sumandos introducidos según la fórmula:
	 *         sum1 + sum2
	 *         <ul>
	 *         <li><b>ATENCIóN:</b> Para operar con números decimales usar la
	 *         ","!!</li>
	 *         <li><b>ATENCIÓN</b> No emplear <b>números negativos</b> para realizar
	 *         los calculos!!!</li>
	 *         </ul>
	 *         <ul>
	 *         <li>Cualquier número entero o real al que se le suma +infinito da
	 *         como resultado +infinito</li>
	 *         <li>Cualquier número entero o real al que se le suma -infinito da
	 *         como resultado -infinito</li>
	 *         <li>Cualquier suma empleando en los sumandos valores de +infinito y
	 *         -infinito dan como resultado un valor NaN</li>
	 *         </ul>
	 * 
	 */

	public static double sumaNumReal(double sum1, double sum2) {
		// Utilizamos tipos float para controlar el que no sebrepase el valor
		float sumador1 = (float) sum1;
		float sumador2 = (float) sum2;
		float resultado = sumador1 + sumador2;

		return (double) resultado;
		
	}

	/**
	 * <b>Método sumaNumEnt</b> que retorna la suma de dos números enteros.
	 * 
	 * @param sum1 Número entero correspondiente con el primer sumando
	 * @param sum2 Número entero correspondiente con el segundo sumando
	 * @return Retorna la suma de los dos sumandos introducidos según la fórmula:
	 *         sum1 + sum2
	 * 
	 *         <ul>
	 *         <li><b>ATENCIÓN</b> No emplear <b>números negativos</b> para realizar
	 *         los calculos!!!</li>
	 *         </ul>
	 *         <ul>
	 *         <li>Cualquier número entero o real al que se le suma +infinito da
	 *         como resultado +infinito</li>
	 *         <li>Cualquier número entero o real al que se le suma -infinito da
	 *         como resultado -infinito</li>
	 *         <li>Cualquier suma empleando en los sumandos valores de +infinito y
	 *         -infinito dan como resultado un valor NaN</li>
	 *         </ul>
	 */

	public static int sumaNumEnt(int sum1, int sum2) {

		// Utilizamos tipos float para controlar el que no sebrepase el valor
		float sumador1 = (float) sum1;
		float sumador2 = (float) sum2;
		float resultado = sumador1 + sumador2;

		if (resultado > Double.MAX_VALUE) {
			System.out.println("Error producido por superar el valor máximo permitido:");
			return (int) Double.MAX_VALUE;

		} else if (resultado < -Double.MAX_VALUE) {
			System.out.println("Error producido por superar el valor mínimo permitido:");
			return (int) -Double.MAX_VALUE;

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
	 *         <li><b>ATENCIóN:</b> Para operar con números decimales usar la
	 *         ","!!</li>
	 *         <li><b>ATENCIÓN</b> No emplear <b>números negativos</b> para realizar
	 *         los calculos!!!</li>
	 *         </ul>
	 *         <ul>
	 *         <li>Cualquier número entero o real al que se le suma +infinito da
	 *         como resultado +infinito</li>
	 *         <li>Cualquier número entero o real al que se le suma -infinito da
	 *         como resultado -infinito</li>
	 *         <li>Cualquier suma empleando en los sumandos valores de +infinito y
	 *         -infinito dan como resultado un valor NaN</li>
	 *         </ul>
	 */

	public static double sumaNumReal(double sum1, double sum2, double sum3) {
		// Utilizamos tipos float para controlar el que no sebrepase el valor
		float sumador1 = (float) sum1;
		float sumador2 = (float) sum2;
		float sumador3 = (float) sum3;
		float resultado = sumador1 + sumador2 + sumador3;

		return (double) resultado;
	}

	/**
	 * Método para sumar acumulativamente diferentes números reales
	 * 
	 * @param sumador    Número real que se quiere añadir al sumatorio
	 * @param acumulador almacenamos el valor del sumatorio de todos los números
	 *                   introducidos
	 *                   <ul>
	 *                   <li><b>ATENCIóN:</b> Para operar con números decimales usar
	 *                   la ","!!</li>
	 *                   <li><b>ATENCIÓN</b> No emplear <b>números negativos</b>
	 *                   para realizar los calculos!!!</li>
	 *                   </ul>
	 *                   <ul>
	 *                   <li>Cualquier número entero o real al que se le suma
	 *                   +infinito da como resultado +infinito</li>
	 *                   <li>Cualquier número entero o real al que se le suma
	 *                   -infinito da como resultado -infinito</li>
	 *                   <li>Cualquier suma empleando en los sumandos valores de
	 *                   +infinito y -infinito dan como resultado un valor NaN</li>
	 *                   <li>Cualquier cálculo que supere el valor del MAX_VALUE y
	 *                   el MIN_VALUE dara mensaje de error y retornará el valos
	 *                   MAX/MIN_Value
	 *                   </ul>
	 */

	static double sumatorio= 0;
	public static double sumatorio(double sumador) {
		sumatorio += sumador;
		return sumatorio;
	}

	/**
	 * Devuelve el valor actual del campo {@link Clase1Suma#acumulador}
	 * @return El valor del campo {@link Clase1Suma#acumulador}
	 */
	public static double getAcumulador() {
		return sumatorio;
	}

	/**
	 * Pone el valor del campo {@link Clase1Suma#acumulador} a 0.
	 */
	public static void resetAcumulador() {
		sumatorio = 0;
	}
}