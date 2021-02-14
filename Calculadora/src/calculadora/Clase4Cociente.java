package calculadora;

/**
 * Clase4Cociente
 * 
 * Contiene los metodos para el calculo de distintos tipos de calculos
 * 
 * 
 * @author Rafa
 * @version 1.0
 * @since 2021-01-24
 * 
 *        AVISO solo utilizar numeros positivos
 */

public class Clase4Cociente {

	// metodos publicos

	/**
	 * Divide dos nuemros reales
	 * 
	 * @param a como dividendo
	 * @param b como divisor
	 * @return el cociente del calculo
	 * <br>
	 * <b>Atención</b>
	 * <ul><li> no usar numeros negativos
	 * <li> solo para valores enteros positivos
	 * <li> solo da el valor del dividendo, el resto se omite</li></ul>
	 */
	public static int reales(int a, int b) {
		int valor = a / b;
		return valor;
	}

	/**
	 * divide dos numeros enteros
	 * 
	 * @param a como dividendo
	 * @param b como divisor
	 * @return el cociente
	 * <br>
	 * <b>Atención</b>
	 * <ul><li> no usar numeros negativos
	 * <li> solo para valores enteros positivos
	 * <li> solo da el valor del dividendo, el resto se omite</li></ul>	 
	 */

	public static double enteros(double a, double b) {
		double valor = a / b;
		return valor;
	}

	/**
	 * calcula el numero inverso a razon de numero a 1/numero
	 * 
	 * @param a numero para calcular el inverso
	 * @return el valor del numero inverso
	 */

	public static double inverso(double a) {

		double num_inv = 1 / a;

		return num_inv;
	}

	/**
	 * Calcula la raiz cuadrada del valor obtenido
	 * 
	 * @param a como valor al que aplicar la raiz con la formula Math
	 * @return valor del calculo de la raiz
	 */

	public static double raiz(double a) {
		double numraiz = Math.sqrt(a);

		return numraiz;

	}

}
