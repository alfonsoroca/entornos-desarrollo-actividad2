package calculadora;

/**
 * Esta clase permite realizar diferentes operaciones de tipo suma:
 * <ul>
 * <li>Suma de dos números reales</li>
 * <li>Suma de dos números enteros</li>
 * <li>Suma de tres números reales</li>
 * <li>Suma acumulativa</li>
 * </ul>
 * 
 * Casos Especiales:
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
	 *         <li>Si cualquiera de los sumandos en NaN, el resultado será NaN</li>
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
	 *         <li>Si la suma da como resultado un valor mayor que {@value Integer#MAX_VALUE}
	 *         devolverá {@value Integer#MAX_VALUE}</li>
	 *         <li>Si la suma da como resultado un valor menor que {@value Integer#MIN_VALUE}
	 *         devolverá {@value Integer#MIN_VALUE}</li>
	 *         </ul>
	 *
	 */

	public static int sumaNumEnt(int sum1, int sum2) {

		// Utilizamos tipos long para controlar el que no sebrepase el valor
		long sumador1 = (long) sum1;
		long sumador2 = (long) sum2;
		long resultado = sumador1 + sumador2;

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
	 *         <li>Si cualquiera de los sumandos en NaN, el resultado será NaN</li>
	 *         </ul>
	 */

	public static double sumaNumReal(double sum1, double sum2, double sum3) {

		double sumador1 = sum1;
		double sumador2 = sum2;
		double sumador3 = sum3;
		double resultado = sumador1 + sumador2 + sumador3;

		return (double) resultado;
	}

	/**
	 * Método para sumar acumulativamente diferentes números reales
	 * 
	 * @param sumador    Número real que se quiere añadir al {@link Clase1Suma#acumulador}.
	 * @return El valor actualizado de {@link Clase1Suma#acumulador}
	 *                   
	 *		<ul>
	 *     	<li>Cualquier número entero o real al que se le suma
	 *     	+infinito da como resultado +infinito</li>
	 *      <li>Cualquier número entero o real al que se le suma
	 *      -infinito da como resultado -infinito</li>
	 *     	<li>Cualquier suma empleando en los sumandos valores de
	 *      +infinito y -infinito dan como resultado un valor NaN</li>
	 *		<li>Si cualquiera de los sumandos en NaN, el resultado será NaN</li>
	 *      </ul>
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