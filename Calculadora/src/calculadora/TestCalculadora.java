package calculadora;

/**
 * Clase que sirve para comprobar la funcionalidad de las distintas clases y
 * m�todos del proyecto calculadora
 * 
 */

public class TestCalculadora {

	public static void main(String[] args) {
		
		//Prueba Clase4Cociente
		Clase4Cociente c4test = new Clase4Cociente();
		double real1 = 25.67;
		double real2 = 4.78;
		double ent1 = 6;
		double ent2 = 2;
		double zero = 0;
		double nan = Double.NaN;
		double masInf = Double.POSITIVE_INFINITY;
		double menInf = Double.NEGATIVE_INFINITY;
		//divisionReales
		System.out.println("Prueba m�todo divisionReales");
		System.out.println(c4test.divisionReales(real1, real2));
		//divisionEnteros
		System.out.println("Prueba m�todo divisionEnteros");
		System.out.println(c4test.divisionEnteros(ent1, ent2));
		//inverso
		System.out.println("Prueba m�todo divisionReales");
		System.out.println(c4test.inverso(zero));
		//raizcuadrada
		System.out.println("Prueba m�todo ra�zCuadrada");
		System.out.println(c4test.raizCuadrada(nan));
		

		/**
		 * Llamada al m�todo que realiza la resta de dos n�mero reales pas�ndole
		 * como argumentos el 21.23 y el 17.16
		 */

		System.out.println(Clase2Resta.restaNumReal(21.23, 17.16));



	}

}
