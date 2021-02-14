package calculadora;

/**
 * 
 * @author Tanis
 * @since 24/01/21
 */


public class Clase3Producto {
	/**
	 * @author tanis
	 * @param a n�mero entero que es el primer factor
	 * @param b n�mero entero que es el segundo factor
	 * @return devuelve el producto de ambos factores
	 * @since 24/01/21
	 */

	public int multiplicar(int a, int b) {
		int prodint = (a * b);
		return prodint;
	}

	/**
	 *<b>ATENCI�N:</b> N�meros grandes pueden provocar error si el resultado del double supera los digitos que soporta
	 * 
	 * @author tanis
	 * @param a n�mero real que es el primer factor
	 * @param b n�mero real que es el segundo factor
	 * @return devuelve el producto de los dos factores
	 * @since 24/01/21
	 */

	public double multiplicar(double a, double b) {
		double prodouble = (a * b);
		return prodouble;
	}

	/**
	 * @author tanis
	 * @param a n�mero real que es el primer factor
	 * @param b n�mero real que es el segundo factor
	 * @param c n�mero real que es el tercer factor
	 * @return devuelve el producto de los tres factores
	 * @since 24/01/21
	 */

	public double multiplicar(double a, double b, double c) {
		double prodouble = (a * b * c);
		return prodouble;
	}

	/**
	 * @author tanis
	 * @param a n�mero real que es la base
	 * @param b n�mero real que es el exponente
	 * @return devuelve el resultado de la base elevada al exponente
	 * @since 24/01/21
	 */

	public double potencia(double a, double b) {
		double pot = (Math.pow(a, b));
		return pot;

	}
}
