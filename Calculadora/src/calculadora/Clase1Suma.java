package calculadora;

import java.util.Scanner;

/**
 * <li>Esta clase permite realizar diferentes operaciones de tipo suma:</li>
 * <ul>
 * <li>Suma de dos números reales</li>
 * <li>Suma de dos números enteros</li>
 * <li>Suma de tres números reales</li>
 * <li>Suma acumulativa</li>
 * </ul>
 * 
 * <li> Casos Especiales </li>
 * <ul>
 * <li>Cualquier número entero o real al que se le suma +infinito da como resultado +infinito</li>
 * <li>Cualquier número entero o real al que se le suma -infinito da como resultado -infinito</li>
 * <li>Cualquier suma empleando en los sumandos valores de +infinito y -infinito dan como resultado un valor NaN </li>
 * 
 * </ul>
 * <br>
 * <b>ATENCIóN:</b> Para operar con números decimales usar la ","!!
 * 
 * @author Alfonso, Estanislao, Rafael
 * @since 24/01/2021
 * 
 * Clase realizada por @Rafa tras la unificación de grupos
 */

public class Clase1Suma {

	/**
	 * M�todo que retorna la suma de dos n�meros reales.
	 * @param sum1 Número real correspondiente con el primer sumando
	 * @param sum2 Número real correspondiente con el segundo sumando
	 * @return Retorna la suma de los dos sumandos introducidos según la fórmula: sum1 + sum2 
	 */

	public static double sumaNumReal(double sum1, double sum2) {

		return sum1 + sum2;
	}

	/**
	 * Método que retorna la suma de dos números enteros.
	 * @param sum1 Número entero correspondiente con el primer sumando
	 * @param sum2 Número entero correspondiente con el segundo sumando
	 * @return Retorna la suma de los dos sumandos introducidos según la fórmula: sum1 + sum2
	 */

	public static int sumaNumEnt(int sum1, int sum2) {

		return sum1 + sum2;
	}

	/**
	 * Método que retorna la suma de tres números reales.
	 * @param sum1 Número real correspondiente con el primer sumando
	 * @param sum2 Número real correspondiente con el segundo sumando
	 * @param sum3 Número real correspondiente con el tercer sumando
	 * @return Retorna la suma de los tres sumandos introducidos según la fórmula: sum1 + sum2 + sum3
	 */

	public static double sumaNumReal(double sum1, double sum2, double sum3) {

		return sum1 + sum2 + sum3;
	}
	
	/**
	 * Método para sumar acumulativamente diferentes números reales
	 * @param num Número real que se quiere añadir al sumatorio
	 */

	public static double sumatorio() {
		double acumulado = 0;
		double sumador = 0;
		//pedimos un valor por teclado y entra en el bucle siempre que no sea 0
		System.out.println("Inserta numeros para realizar una suma acumulativa. \n Si introduces 0 acabara, para indicar decimales utilizar ','\n");
		Scanner sc= new Scanner(System.in);
			acumulado = sumador = sc.nextDouble();
		//mientras el valor añadido no sea 0, se ejecuta el bucle añadiendo todos los valores introducicos
		while(sumador != 0) {
			System.out.println("Siguiente valor. \nRecuerda: si introduces 0 acabara y ',' para decimales\n");
			Scanner valor= new Scanner(System.in);
				sumador = valor.nextDouble();
				acumulado += sumador;
		
		}
		//retorna el valor del valor acumuado
		sc.close();
		return acumulado;
		
		
	}
	/**
	 * En la variable almacenamos el valor del sumatorio de todos los 
	 * n�meros introducidos a trav�s del m�todo sumatorio
	 */
 
}