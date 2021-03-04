package calculadora;

/**
 * Clase que sirve para comprobar la funcionalidad de las distintas clases y
 * metodos del proyecto calculadora
 * 
 */

public class TestCalculadora {

	public static void main(String[] args) {

		
		//Prueba Clase1Suma
		//variables compartidas para las pruebas
		double sumador1 = 20.98;
		double sumador2 = 24.36;
		
		//sumar dos numeros reales
		System.out.println(Clase1Suma.sumaNumReal(sumador1, sumador2));
		
		//sumar dos numeros enteros
		System.out.println(Clase1Suma.sumaNumEnt(14, 57));
		
		//sumar tres numeros reales
		System.out.println(Clase1Suma.sumaNumReal(sumador1, sumador2,-15));
		//acumular numeros sumandolos
		
		System.out.println("el valor de los numeros agregados es : " + Clase1Suma.sumatorio());
		
		System.out.println("\n-----------  FIN PRUEBA cLASE1SUMA --------------\n");
		//-----------  FIN PRUEBA cLASE1SUMA --------------
	
		//Prueba Clase4Cociente


		// Prueba Clase4Cociente
		double real1 = 25.67;
		double real2 = 4.78;
		double ent1 = 6;
		double ent2 = 2;
		double zero = 0;
		double nan = Double.NaN;
		double masInf = Double.POSITIVE_INFINITY;
		double menInf = Double.NEGATIVE_INFINITY;
		// divisionReales
		System.out.println("Prueba metodo divisionReales");
		System.out.println(Clase4Cociente.divisionReales(real1, real2));
		// divisionEnteros
		System.out.println("Prueba metodo divisionEnteros");
		System.out.println(Clase4Cociente.divisionEnteros(ent1, ent2));
		// inverso
		System.out.println("Prueba metodo inverso");
		System.out.println(Clase4Cociente.inverso(zero));
		System.out.println(Clase4Cociente.inverso(menInf));
		System.out.println(Clase4Cociente.inverso(nan));
		// raizcuadrada
		System.out.println("Prueba metodo raizCuadrada");
		System.out.println(Clase4Cociente.raizCuadrada(nan));

		// Prueba Clase3Producto
		

		System.out.println("\n" + "\n" + "Prueba multiplicarEntero:" + Clase3Producto.multiplicarEntero(-2, 4)  );
		System.out.println("Prueba multiplicarDouble: " + Clase3Producto.multiplicarDouble(masInf, ent2));
		System.out.println("Prueba multiplicar3: " + Clase3Producto.multiplicar3(real2, ent1, real1));
		System.out.println("Prueba Potencia: " + Clase3Producto.potencia(1, 5));

		// Prueba Clase2Resta

		//Inicio pruebas Clase2Resta		

		int int1 = 150000;
		int int2 = 12356;
		double double1 = 136531.536944;
		double double2 = 478931.123568;
		double double3 = 1323231.268944;
		
		//Prueba del método restaNumReal con 2 parámetros
		System.out.println("\nPrueba del método restaNumReal con 2 parámetros: " + Clase2Resta.restaNumReal(double1, double2));
		
		//Prueba del método restaNumEnt
		System.out.println("\nPrueba del método restaNumEnt: " + Clase2Resta.restaNumEnt(int1, int2));
		
		//Prueba del método restaNumReal con 3 parámetros
		System.out.println("\nPrueba del método restaNumReal con 3 parámetros: " + Clase2Resta.restaNumReal(double1, double2, double3));
		
		//Prueba del método acumular
		System.out.println("\nPrueba del método acumular-----");

		System.out.println("\nHas pulsado el 0 y has salido del acumulador. El total acumulado asciende a: " + Clase2Resta.acumular());

		System.out.println("\n----- Fin de las pruebas de la Clase2Resta -----\n");
		
		//Fin pruebas Clase2Resta
	}

}
