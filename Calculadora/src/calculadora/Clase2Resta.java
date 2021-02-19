package calculadora;

/**
 * Esta clase permite realizar diferentes operaciones de resta:
 * <ul>
 * <li>Resta de dos números reales</li>
 * <li>Resta de dos números enteros</li>
 * <li>Resta de tres números reales</li>
 * <li>Resta recurrente</li>
 * </ul>
 * <br>
 * <b>ATENCIÓN:</b> No se pueden usar números negativos en algunas operaciones
 * 
 * @author Alfonso
 * @since 24/01/2021
 * 
 */

public class Clase2Resta {

	/**
	 * Método que retorna la resta de dos números reales.</br>
	 * </br>
	 * Con el fin de evitar que se usen números negativos en la operación, se
	 * utilizará el valor absoluto de los números introducidos. <br>
	 * <br>
	 * <b>Atención:</b> No se pueden usar números negativos en las operaciones
	 * 
	 * @param min  Valor absoluto del número real correspondiente con el minuendo
	 * @param sust Valor absoluto del número real correspondiente con el sustraendo
	 * @return Retorna la resta del valor absoluto de los dos números introducidos
	 *         según la fórmula: min - sust
	 */

	public static double restaNumReal(double min, double sust) {
		min = Math.abs(min);
		sust = Math.abs(sust);

		return min - sust;
	}

	/**
	 * Método que retorna la resta de dos números entrero.</br>
	 * </br>
	 * Con el fin de evitar que se usen números negativos en la operación, se
	 * utilizará el valor absoluto de los números introducidos. <br>
	 * <br>
	 * <b>Atención:</b> No se pueden usar números negativos en las operaciones
	 * 
	 * @param min  Valor absoluto del número entero correspondiente con el minuendo
	 * @param sust Valor absoluto del número entero correspondiente con el
	 *             sustraendo
	 * @return Retorna la resta del valor absoluto de los dos números introducidos
	 *         según la fórmula: min - sust
	 */

	public static int restaNumEnt(int min, int sust) {
		min = Math.abs(min);
		sust = Math.abs(sust);

		return min - sust;
	}

	/**
	 * Método que retorna la resta de tres números reales.</br>
	 * </br>
	 * Con el fin de evitar que se usen números negativos en la operación, se
	 * utilizará el valor absoluto de los números introducidos. <br>
	 * <br>
	 * <b>Atención:</b> No se pueden usar números negativos en las operaciones
	 * 
	 * @param min   Valor absoluto del número real correspondiente con el minuendo
	 * @param sust1 Valor absoluto del número real correspondiente con el primer
	 *              sustraendo
	 * @param sust2 Valor absoluto del número real correspondiente con el segundo
	 *              sustraendo
	 * @return Retorna la resta de los tres números introducidos según la fórmula:
	 *         (min - sust1) - sust2
	 */

	public static double restaNumReal(double min, double sust1, double sust2) {
		min = Math.abs(min);
		sust1 = Math.abs(sust1);
		sust2 = Math.abs(sust2);

		return (min - sust1) - sust2;
	}

// Siguiente revisión debe comenzar a partir de éste punto
	/**
	 * Método que acumula el resultado de los números introducidos a través del
	 * método acumular.<br>
	 * <br>
	 * Con el fin de evitar que se usen números negativos en la operación, se
	 * utilizará el valor absoluto de los números introducidos. <br>
	 * <br> 
	 * Para la resta de un número, se debe indicar con un signo "-" delante del
	 * número introducido, en caso contrario el número se añadirá al acumulado
	 * 
	 * @param num Número real que se quiere añadir/restar al acumulado
	 */

	public static void acumular(double num) {

		acumulado += num;

	}

	/**
	 * En la variable almacenamos el valor del resultado de todos los números
	 * introducidos través del método acumular
	 */

	public static double acumulado;

}
