package calculadora;

/**
 * La clase {@code Clase4Cociente} implementa cuatro métodos relacionados con la división de números
 * @author JSAlor
 * @version 1.0 
 */
public class Clase4Cociente {
	//Métodos públicos de clase
	
	/**
	 * Recibe dos números reales y devuelve un {@code double} con el resultado de dividir ambos números.
	 * <br>Casos especiales:
	 * <ul><li>Si el parámetro que se pasa como divisor es 0, el método mostrará un aviso y devolverá un 
	 * {@code double} con el valor Infinito.</li></ul>
	 * 
	 * @param a Dividendo de la operación.
	 * @param b Divisor de la operación.
	 * @return Un {@code double}  con el cociente. En el caso de que el divisor <b>b</b> sea <b>0</b>, muestra un mensaje 
	 * de aviso y devuelve <b>Infinito</b>.
	 */
	public double divisionReales (double a, double b) {
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
	 * {@code double} con el valor Infinito.</li></ul>
	 * 
	 * @param a Dividendo de la operación.
	 * @param b Divisor de la operación.
	 * @return un {@code double}, con el menor entero que resulta de la operación, o <b>Infinito</b> en 
	 * el caso de que el divisor <b>b</b> sea <b>0</b>.
	 */
	public double divisionEnteros (double a, double b) {
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
	 * <ul><li>Si el parámetro que se pasa es 0, el método mostrará un aviso y devolverá un 
	 * {@code double} con el valor Infinito.</li></ul>
	 * 
	 * @param a El número del que se desea calcular el inverso.
	 * @return El inverso del número, o Infinito en caso de que éste sea 0.
	 */
	public double inverso (double a) {
		/*Eliminamos la parte decimal*/
		if (a==0) {
			System.out.println("ERROR: No se puede dividir por 0"); 
		}
		return 1/a;
	}
	
	/**
	 * Realiza la raíz cuadrada del número que se le pasa como parámetro.
	 * @param a El número del que se desea saber la raíz cuadrada
	 * @return La raíz cuadrada del parametro recibido.
	 */
	public double raizCuadrada (double a) {
		return Math.sqrt(a);
	}
}
