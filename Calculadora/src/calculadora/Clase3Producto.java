package Calculadora.src.calculadora;

/**
 * 
 * @author Tanis
 * @author Cesar Modificacion
 * @since 24/01/21
 */

public class Clase3Producto {
	/**
	 * @param num1  nummero entero que es el primerfactor
	 * @param num2  numero entero que el segundo factor 
	 * @return devuelve el producto de ambos factores
	 * @since 24/01/21
	 * 
	 * 
	 */
	
	public static int multiplicarEntero(int num1, int num2) {

		return num1 * num2;
		
	}

	/** 
	 * 
	 * @param num1  Numero real que es el primer factor
	 * @param num2  Numero real que es el segundo factor
	 * @return devuelve el producto de los dos factores
	 * @since 24/01/21
	 * 
	 * <li>Si un parametro se multiplica por infinito(positivo) el resultado sera Infinito(positivo) </li>
	 * <li>Si un parametro se multiplica por infinito(negativo) el resultado sera Infinito(negativo) </li>
	 */

	public static double multiplicarDouble(double num1, double num2) {

		return num1 * num2;
	}

	/**
	 * 
	 * @param num1  Numero real que es el primer factor
	 * @param num2  Numero real que es el segundo factor
	 * @param num3  Numero real que es el tercer factor
	 * @return devuelve el producto de los tres factores
	 * @since 24/01/21
	 *  
	 * <li>Si uno de los parametros es infinito(positivo) el resultado sera Infinito(positivo) </li>
	 * <li>Si uno de los parametros es infinito(negativo) el resultado sera Infinito(negativo) </li>
	 */

	public static double multiplicar3(double num1, double num2, double num3) {

		return (num1 * num2) * num3;
	}

	/**
	 * 
	 * @param num1  Numero real que es la base
	 * @param num2  Numero real que es el exponente
	 * @return devuelve el resultado de la base elevada al exponente
	 * @since 24/01/21
	 * 
	 * 
	 * <li>Cuando la base es elevada a Infinito(positivo) el resultado dará Infinito(positivo)</li>
	 * <li>Cuando la base es Infinito(positivo) y el exponente es Infinito(negativo) el resultado será 0</li>
	 * <li>Cuando la base es 0 y exponente 0 el resultado dará 1</li>
	 * 
	 */

	public static double potencia(double num1, double num2) {

		return Math.pow(num1, num2);

	}
}
