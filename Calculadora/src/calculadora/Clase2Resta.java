package calculadora;


/**
 * Esta clase permite realizar diferentes operaciones de resta:
 * <ul>
 * <li>Resta de dos números reales {@link #restaNumReal(double, double) restaNumerosReales}</li>
 * <li>Resta de dos números enteros {@link #restaNumEnt(int, int) restaNumerosEnteros}</li>
 * <li>Resta de tres números reales {@link #restaNumReal(double, double, double) restaTresNumerosReales}</li>
 * <li>Acumular {@link #acumular(double) acumular}</li>
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

		double min = a;
		double sust1 = b;
		double resultado = min - sust1;

		return resultado;
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
			System.out.println("Error producido por superar el valor máximo permitido.");
			return Integer.MAX_VALUE;

		} else if (resultado < Integer.MIN_VALUE) {
			System.out.println("Error producido por superar el valor mínimo permitido.");
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

		double min = a;
		double sust1 = b;
		double sust2 = c;
		double resultado = (min - sust1) - sust2;

		return resultado;
	}
	
	static double acumulado = 0;
	
	/**
	 * Método para acumular valores en una variable
	 * 
	 * @param numero Valor que se desea añadir a la variable
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

	public static double acumular(double numero) {
		acumulado += numero;
		return acumulado;
	}

	/**
	 * Devuelve el valor actual del campo {@link Clase2Resta#acumulado}
	 * 
	 * @return El valor del campo {@link Clase2Resta#acumulado}
	 */

	public static double getAcumulado() {
		return acumulado;
	}

	/**
	 * Resetea el valor del campo {@link Clase2Resta#acumulado} a 0.
	 */
	public static void resetAcumulado() {
		acumulado = 0;
	}

}
