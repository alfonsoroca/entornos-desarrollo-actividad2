package calculadora;

/**
 * La clase {@code Clase4Cociente} implementa cuatro métodos relacionados con la división de números
 * 
 * Los métodos que implementa son {@link #divisionReales(double, double) divisionReales}, 
 * {@link #divisionEnteros(double, double) divisionEnteros}, {@link #inverso(double) inverso} y
 * {@link #raizCuadrada(double) raizCuadrada}.
 * Todos los métodos son {@code static}.
 * @author JSAlor
 * @version 1.0 
 */
public class Clase4Cociente {
	//Métodos públicos de clase
	
	/**
	 * Recibe dos números reales y devuelve un {@code double} con el resultado de dividir ambos números.
	 * <br>Casos especiales:
	 * <ul><li>Si el parámetro que se pasa como divisor es 0, el método mostrará un aviso y devolverá un 
	 * {@code double} con el valor Infinito.</li>
	 * <li>Si ambos parámetros son 0, el método devuelve un {@code double} con el valor NaN</li></ul>
	 * 
	 * @param  a  Dividendo de la operación.
	 * @param  b  Divisor de la operación.
	 * @return Un {@code double}  con el cociente. En el caso de que el divisor <b>b</b> sea <b>0</b>, muestra un mensaje 
	 * de aviso y devuelve <b>Infinito</b> o <b>NaN</b>.
	 */
	public static double divisionReales (double a, double b) {
		/*Comprobar que el divisor no sea 0*/
		if (b==0) {
			System.out.println("AVISO: No se puede dividir por 0");
			return a/b;			
		}
		else {
			return a/b;
		}	
	}
	
	/**
	 * Recibe dos números, los aproxima al entero inferior y devuelve un {@code double} con la parte entera
	 * que resulta de dividir ambos números.
	 * <br>Casos especiales:
	 * <ul><li>Si el parámetro que se pasa como divisor es 0, el método mostrará un aviso y devolverá un 
	 * {@code double} con el valor Infinito.</li>
	 * <li>Si ambos parámetros son 0, el método devuelve NaN</li></ul>
	 * 
	 * @param  a  Dividendo de la operación.
	 * @param  b  Divisor de la operación.
	 * @return un {@code double}, con el menor entero que resulta de la operación, <b>Infinito</b> en 
	 * el caso de que el divisor <b>b</b> sea <b>0</b>, o <b>NaN</b> en caso de que ambos parámetros sean <b>0</b>.
	 */
	public static double divisionEnteros (double a, double b) {
		/*Eliminamos la parte decimal aproximando al entero inferior*/
		a = Math.floor(a);
		b = Math.floor(b);
		/*Comprobar que el divisor no sea 0*/
		if (b==0) {
			System.out.println("ERROR: No se puede dividir por 0");
			return a/b;
		}
		else {
			return Math.floor(a/b);
		}
		
	}
	
	/**
	 * Recibe un número como parámetro y devuelve el inverso.
	 * <br>Casos especiales:
	 * <ul>
	 * <li>Si el parámetro que se pasa es 0, el método mostrará un aviso y devolverá un 
	 * {@code double} con el valor Infinito.</li>
	 * <li>Si el parámetro pasado es {@value Double#POSITIVE_INFINITY} el método devolverá
	 * un 0.</li>
	 * <li>Si el parámetro pasado es {@value Double#NEGATIVE_INFINITY} el método devolverá
	 * un -0.</li>
	 * <li>Si el parámetro introducido en {@value Double#NaN} devolverá {@value Double#NaN}.
	 * </ul>
	 * 
	 * @param  a  El número del que se desea calcular el inverso.
	 * @return El inverso del número, o Infinito en caso de que éste sea 0.
	 */
	public static double inverso (double a) {
		/*Eliminamos la parte decimal*/
		if (a==0) {
			System.out.println("ERROR: No se puede dividir por 0"); 
		}
		return 1/a;
	}
	
	/**
	 * Devuelve la raíz cuadrada positiva del {@code double} que se le pasa como parámetro.
	 * <br>Casos especiales:
	 * <ul><li>Si el argumento es NaN o menor que 0, entonces devuelve NaN.
     * <li>Si el argumento es Infinito positivo, devuelve Infinito positivo.</li></ul>
     * En cualquier otro caso, el resultado es un {@code double} con el valor más crecano
     * a la verdadera raíz cuadrada del argumento.
	 * @param  a  El número del que se desea saber la raíz cuadrada
	 * @return La raíz cuadrada de {@code a}. Si el argumento es NaN o menor que 0, devuelve NaN.	
	 */
	 
	public static double raizCuadrada (double a) {
		return Math.sqrt(a);
	}
}


