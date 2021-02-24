package calculadora;

// Esta clase es la que dejamos abandonada por ser 3 participantes en el grupo

/**
 * Esta clase permite realizar diferentes operaciones de suma:
 * <ul>
 * <li>Suma de dos n�meros reales</li>
 * <li>Suma de dos n�meros enteros</li>
 * <li>Suma de tres n�meros reales</li>
 * <li>Suma acumulativa</li>
 * </ul>
 * <br>
 * <b>ATENCI�N:</b> No se pueden usar n�meros negativos en las operaciones
 * 
 * @author Alfonso, Estanislao, Rafael
 * @since 24/01/2021
 * 
 * Clase realizada por @Rafa tras la unificacion de grupos
 */

public class Clase1Suma {

	/**
	 * M�todo que retorna la suma de dos n�meros reales.
	 * <br><br><b>Atenci�n:</b> No se pueden usar n�meros negativos en las operaciones
	 * @param sum1 N�mero real correspondiente con el primer sumando
	 * @param sum2 N�mero real correspondiente con el segundo sumando
	 * @return Retorna la suma de los dos sumandos introducidos seg�n la f�rmula: sum1 + sum2
	 *  
	 */

	public static double sumaNumReal(double sum1, double sum2) {

		return sum1 + sum2;
	}

	/**
	 * M�todo que retorna la suma de dos n�meros enteros.
	 * <br><br><b>Atenci�n:</b> No se pueden usar n�meros negativos en las operaciones
	 * @param sum1 N�mero entero correspondiente con el primer sumando
	 * @param sum2 N�mero entero correspondiente con el segundo sumando
	 * @return Retorna la suma de los dos sumandos introducidos seg�n la f�rmula: sum1 + sum2
	 * 
	 */

	public static int sumaNumEnt(int sum1, int sum2) {

		return sum1 + sum2;
	}

	/**
	 * M�todo que retorna la suma de tres n�meros reales.
	 * <br><br><b>Atenci�n:</b> No se pueden usar n�meros negativos en las operaciones 
	 * @param sum1 N�mero real correspondiente con el primer sumando
	 * @param sum2 N�mero real correspondiente con el segundo sumando
	 * @param sum3 N�mero real correspondiente con el tercer sumando
	 * @return Retorna la suma de los tres sumandos introducidos seg�n la f�rmula: sum1 + sum2 + sum3
	 * 
	 */

	public static double sumaNumReal(double sum1, double sum2, double sum3) {

		return sum1 + sum2 + sum3;
	}
	
	/**
	 * M�todo para sumar acumulativamente diferentes n�meros reales
	 * <br><br><b>Atenci�n:</b> No se pueden usar n�meros negativos en las operaciones
	 * @param num N�mero real que se quiere a�adir al sumatorio
	 * 
	 */

	public static void sumatorio(double num) {

		acumulado += num;

	}
	/**
	 * En la variable almacenamos el valor del sumatorio de todos los 
	 * n�meros introducidos a trav�s del m�todo sumatorio
	 */

	public static double acumulado;

}
