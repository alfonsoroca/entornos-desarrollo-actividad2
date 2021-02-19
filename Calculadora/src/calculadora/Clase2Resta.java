package calculadora;

/**
 * Esta clase permite realizar diferentes operaciones de resta:
 * <ul>
 * <li>Resta de dos n�meros reales</li>
 * <li>Resta de dos n�meros enteros</li>
 * <li>Resta de tres n�meros reales</li>
 * <li>Resta recurrente</li>
 * </ul>
 * <br>
 * <b>ATENCI�N:</b> No se pueden usar n�meros negativos en algunas operaciones
 * 
 * @author Alfonso
 * @since 24/01/2021
 * 
 */

public class Clase2Resta {

	/**
	 * M�todo que retorna la resta de dos n�meros reales.</br>
	 * </br>
	 * Con el fin de evitar que se usen n�meros negativos en la operaci�n, se
	 * utilizar� el valor absoluto de los n�meros introducidos. <br>
	 * <br>
	 * <b>Atenci�n:</b> No se pueden usar n�meros negativos en las operaciones
	 * 
	 * @param min  Valor absoluto del n�mero real correspondiente con el minuendo
	 * @param sust Valor absoluto del n�mero real correspondiente con el sustraendo
	 * @return Retorna la resta del valor absoluto de los dos n�meros introducidos
	 *         seg�n la f�rmula: min - sust
	 */

	public static double restaNumReal(double min, double sust) {
		min = Math.abs(min);
		sust = Math.abs(sust);

		return min - sust;
	}

	/**
	 * M�todo que retorna la resta de dos n�meros entrero.</br>
	 * </br>
	 * Con el fin de evitar que se usen n�meros negativos en la operaci�n, se
	 * utilizar� el valor absoluto de los n�meros introducidos. <br>
	 * <br>
	 * <b>Atenci�n:</b> No se pueden usar n�meros negativos en las operaciones
	 * 
	 * @param min  Valor absoluto del n�mero entero correspondiente con el minuendo
	 * @param sust Valor absoluto del n�mero entero correspondiente con el
	 *             sustraendo
	 * @return Retorna la resta del valor absoluto de los dos n�meros introducidos
	 *         seg�n la f�rmula: min - sust
	 */

	public static int restaNumEnt(int min, int sust) {
		min = Math.abs(min);
		sust = Math.abs(sust);

		return min - sust;
	}

	/**
	 * M�todo que retorna la resta de tres n�meros reales.</br>
	 * </br>
	 * Con el fin de evitar que se usen n�meros negativos en la operaci�n, se
	 * utilizar� el valor absoluto de los n�meros introducidos. <br>
	 * <br>
	 * <b>Atenci�n:</b> No se pueden usar n�meros negativos en las operaciones
	 * 
	 * @param min   Valor absoluto del n�mero real correspondiente con el minuendo
	 * @param sust1 Valor absoluto del n�mero real correspondiente con el primer
	 *              sustraendo
	 * @param sust2 Valor absoluto del n�mero real correspondiente con el segundo
	 *              sustraendo
	 * @return Retorna la resta de los tres n�meros introducidos seg�n la f�rmula:
	 *         (min - sust1) - sust2
	 */

	public static double restaNumReal(double min, double sust1, double sust2) {
		min = Math.abs(min);
		sust1 = Math.abs(sust1);
		sust2 = Math.abs(sust2);

		return (min - sust1) - sust2;
	}

	/**
	 * M�todo que acumula los n�meros introducidos a trav�s del m�todo acumular.<br>
	 * <br>
	 * Para a�adir n�meros al acumulador se deben introducir los n�meros sin ning�n
	 * signo delante (ej. 1345.26) Para restar n�meros al acumulador se deben
	 * introducir los n�meros con un signo "-" delante del n�mero introducido (ej.
	 * -758.31)
	 * 
	 * @param num N�mero real que se quiere a�adir/restar al acumulado
	 */

	public static void acumular(double num) {

		acumulado += num;

	}

	/**
	 * En la variable almacenamos el valor del resultado de todos los n�meros
	 * introducidos trav�s del m�todo acumular
	 */

	public static double acumulado;

}
