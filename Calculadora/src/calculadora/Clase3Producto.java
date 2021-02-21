package calculadora;

/**
 * 
 * @author Tanis
 * @author Cesar Modificacion
 * @since 24/01/21
 */


public class Clase3Producto {
	/**
	 * @param num1 número entero que es el primer factor
	 * @param num2 número entero que es el segundo factor
	 * @return devuelve el producto de ambos factores
	 * @since 24/01/21
	 */

	public int multiplicarEntero(int num1, int num2) {
		int prodint = (num1 * num2);
		return prodint;
	}

	/**
	 *<b>ATENCIÓN:</b> Números grandes pueden provocar error si el resultado del double supera los digitos que soporta
	 * 
	 * @param num1 número real que es el primer factor
	 * @param num2 número real que es el segundo factor
	 * @return devuelve el producto de los dos factores
	 * @since 24/01/21
	 */

	public double multiplicarDouble(double num1, double num2) {
		double prodouble = (num1 * num2);
		return prodouble;
	}

	/**
	 * @param num1 número real que es el primer factor
	 * @param num2 número real que es el segundo factor
	 * @param num3 número real que es el tercer factor
	 * @return devuelve el producto de los tres factores
	 * @since 24/01/21
	 */

	public double multiplicar(double num1, double num2, double num3) {
		double prodouble = (num1 * num2) * num3;
		return prodouble;
	}

	/**
	 * @param num1 número real que es la base
	 * @param num2 número real que es el exponente
	 * @return devuelve el resultado de la base elevada al exponente
	 * @since 24/01/21
	 */

	public double potencia(double num1, double num2) {
		double pot = (Math.pow(num1, num2));
		return pot;

	}
}
