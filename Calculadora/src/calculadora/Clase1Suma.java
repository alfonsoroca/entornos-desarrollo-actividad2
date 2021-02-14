package calculadora;

/**
 * Esta clase permite realizar diferentes operaciones de suma:
 * <ul>
 * <li>Suma de dos números reales</li>
 * <li>Suma de dos números enteros</li>
 * <li>Suma de tres números reales</li>
 * <li>Suma acumulativa</li>
 * </ul>
 * <br>
 * <b>ATENCIÓN:</b> No se pueden usar números negativos en las operaciones
 * 
 * @author Alfonso, Estanislao, Rafael
 * @since 24/01/2021
 * 
 */

public class Clase1Suma {

	/**
	 * Método que retorna la suma de dos números reales.
	 * <br><br><b>Atención:</b> No se pueden usar números negativos en las operaciones
	 * @param sum1 Número real correspondiente con el primer sumando
	 * @param sum2 Número real correspondiente con el segundo sumando
	 * @return Retorna la suma de los dos sumandos introducidos según la fórmula: sum1 + sum2
	 *  
	 */

	public static double sumaNumReal(double sum1, double sum2) {

		return sum1 + sum2;
	}

	/**
	 * Método que retorna la suma de dos números enteros.
	 * <br><br><b>Atención:</b> No se pueden usar números negativos en las operaciones
	 * @param sum1 Número entero correspondiente con el primer sumando
	 * @param sum2 Número entero correspondiente con el segundo sumando
	 * @return Retorna la suma de los dos sumandos introducidos según la fórmula: sum1 + sum2
	 * 
	 */

	public static int sumaNumEnt(int sum1, int sum2) {

		return sum1 + sum2;
	}

	/**
	 * Método que retorna la suma de tres números reales.
	 * <br><br><b>Atención:</b> No se pueden usar números negativos en las operaciones 
	 * @param sum1 Número real correspondiente con el primer sumando
	 * @param sum2 Número real correspondiente con el segundo sumando
	 * @param sum3 Número real correspondiente con el tercer sumando
	 * @return Retorna la suma de los tres sumandos introducidos según la fórmula: sum1 + sum2 + sum3
	 * 
	 */

	public static double sumaNumReal(double sum1, double sum2, double sum3) {

		return sum1 + sum2 + sum3;
	}
	
	/**
	 * Método para sumar acumulativamente diferentes números reales
	 * <br><br><b>Atención:</b> No se pueden usar números negativos en las operaciones
	 * @param num Número real que se quiere añadir al sumatorio
	 * 
	 */

	public static void sumatorio(double num) {

		acumulado += num;

	}
	/**
	 * En la variable almacenamos el valor del sumatorio de todos los 
	 * números introducidos a través del método sumatorio
	 */

	public static double acumulado;

}
