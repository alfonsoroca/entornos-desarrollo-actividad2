package calculadora;

/**
 * La clase {@code Clase4Cociente} implementa cuatro m�todos relacionados con la divisi�n de n�meros
 * @author JSAlor
 * @version 1.0 
 */
public class Clase4Cociente {
	//M�todos p�blicos de clase
	
	/**
	 * Recibe dos n�meros reales y devuelve un {@code double} con el resultado de dividir ambos n�meros.
	 * <br>Casos especiales:
	 * <ul><li>Si el par�metro que se pasa como divisor es 0, el m�todo mostrar� un aviso y devolver� un 
	 * {@code double} con el valor Infinito.</li>
	 * <li>Si ambos par�metros son 0, el m�todo devuelve un {@code double} con el valor NaN</li></ul>
	 * 
	 * @param  a  Dividendo de la operaci�n.
	 * @param  b  Divisor de la operaci�n.
	 * @return Un {@code double}  con el cociente. En el caso de que el divisor <b>b</b> sea <b>0</b>, muestra un mensaje 
	 * de aviso y devuelve <b>Infinito</b> o <b>NaN</b>.
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
	 * Recibe dos n�meros, los aproxima al entero inferior y devuelve un {@code double} con la parte entera
	 * que resulta de dividir ambos n�meros.
	 * <br>Casos especiales:
	 * <ul><li>Si el par�metro que se pasa como divisor es 0, el m�todo mostrar� un aviso y devolver� un 
	 * {@code double} con el valor Infinito.</li>
	 * <li>Si ambos par�metros son 0, el m�todo devuelve NaN</li></ul>
	 * 
	 * @param  a  Dividendo de la operaci�n.
	 * @param  b  Divisor de la operaci�n.
	 * @return un {@code double}, con el menor entero que resulta de la operaci�n, <b>Infinito</b> en 
	 * el caso de que el divisor <b>b</b> sea <b>0</b>, o <b>NaN</b> en caso de que ambos par�metros sean <b>0</b>.
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
	 * Recibe un n�mero como par�metro y devuelve el inverso.
	 * <br>Casos especiales:
	 * <ul><li>Si el par�metro que se pasa es 0, el m�todo mostrar� un aviso y devolver� un 
	 * {@code double} con el valor Infinito.</li></ul>
	 * <li>Si el par�metro pasado es {@value Double#POSITIVE_INFINITY} el m�todo devolver�
	 * un 0.</li>
	 * <li>Si el par�metro pasado es {@value Double#NEGATIVE_INFINITY} el m�todo devolver�
	 * un -0.</li>
	 * <li>Si el par�metro introducido en {@value Double#NaN} devolver� {@value Double#NaN}.
	 * 
	 * @param  a  El n�mero del que se desea calcular el inverso.
	 * @return El inverso del n�mero, o Infinito en caso de que �ste sea 0.
	 */
	public double inverso (double a) {
		/*Eliminamos la parte decimal*/
		if (a==0) {
			System.out.println("ERROR: No se puede dividir por 0"); 
		}
		return 1/a;
	}
	
	/**
	 * Devuelve la ra�z cuadrada positiva del {@code double} que se le pasa como par�metro.
	 * <br>Casos especiales:
	 * <ul><li>Si el argumento es NaN o menor que 0, entonces devuelve NaN.
     * <li>Si el argumento es Infinito positivo, devuelve Infinito positivo.</li></ul>
     * En cualquier otro caso, el resultado es un {@code double} con el valor m�s crecano
     * a la verdadera ra�z cuadrada del argumento.
	 * @param  a  El n�mero del que se desea saber la ra�z cuadrada
	 * @return La ra�z cuadrada de {@code a}. Si el argumento es NaN o menor que 0, devuelve NaN.	
	 */
	 
	public double raizCuadrada (double a) {
		return Math.sqrt(a);
	}
}
