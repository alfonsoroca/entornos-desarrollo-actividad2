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
		
		Clase1Suma.sumatorio();
		
		System.out.println("\n-----------  FIN PRUEBA cLASE1SUMA --------------\n");
		//-----------  FIN PRUEBA cLASE1SUMA --------------
	
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
		System.out.println("Prueba metodo divisionReales");
		System.out.println(c4test.divisionReales(real1, real2));
		//divisionEnteros
		System.out.println("Prueba metodo divisionEnteros");
		System.out.println(c4test.divisionEnteros(ent1, ent2));
		//inverso
		System.out.println("Prueba metodo inverso");
		System.out.println(c4test.inverso(zero));
		System.out.println(c4test.inverso(menInf));
		System.out.println(c4test.inverso(nan));
		//raizcuadrada
		System.out.println("Prueba metodo raizCuadrada");
		System.out.println(c4test.raizCuadrada(nan));

		//Prueba Clase3Producto
		System.out.println("\n" + "\n" + "Prueba multiplicarEntero:" + "\n" + Clase3Producto.multiplicarEntero(-5, 4));
		System.out.println("Prueba multiplicarDouble: " + "\n" + Clase3Producto.multiplicarDouble(ent1, ent2) );
		System.out.println("Prueba multiplicar3: " + "\n" + Clase3Producto.multiplicar3(real2, ent1, real1));
		System.out.println("Prueba Potencia: " + "\n" + Clase3Producto.potencia(2, 5));
		
		//Inicio pruebas Clase2Resta		
		int int1 = 150000;
		int int2 = 12356;
		double double1 = 136531.536944;
		double double2 = 478931.123568;
		double double3 = 1323231.268944;
		
		System.out.println("\n----- Inicio de las pruebas de la Clase2Resta -----\n");
		
		//Prueba del método restaNumReal con 2 par�metros
		System.out.println("\nPrueba del método restaNumReal con 2 parámetros: " + Clase2Resta.restaNumReal(double1, double2));
		
		//Prueba del método restaNumEnt
		System.out.println("\nPrueba del método restaNumEnt: " + Clase2Resta.restaNumEnt(int1, int2));
		
		//Prueba del método restaNumReal con 3 par�metros
		System.out.println("\nPrueba del método restaNumReal con 3 parámetros: " + Clase2Resta.restaNumReal(double1, double2, double3));
		
		//Prueba del método acumular
		System.out.println("\nPrueba del método acumular-----");

		System.out.println("\nHas pulsado el 0 y has salido del acumulador. El total acumulado asciende a: " + Clase2Resta.acumular());
		System.out.println("\n----- Fin de las pruebas de la Clase2Resta -----\n");
		
		//Fin pruebas Clase2Resta
	}

}
