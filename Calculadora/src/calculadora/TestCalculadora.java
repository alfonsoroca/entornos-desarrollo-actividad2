package calculadora;

/**
 * Clase que sirve para comprobar la funcionalidad de las distintas clases y
 * metodos del proyecto calculadora
 * 
 * @author Alfonso, Rafa, César, Jorge
 */

public class TestCalculadora {

	public static void main(String[] args) {

		//---------- INICIO PRUEBA Clase1Suma -------------
		
		System.out.println("\n----------- INICIO PRUEBA Clase1Suma --------------\n");
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
		System.out.println("Valores a añadir en el método sumatorio: " );
		double[] valores = {10.2, 5, -7, 9.3, 8};
		for (int i=0; i < valores.length ;i++) {
			System.out.println(valores[i]);
			Clase1Suma.sumatorio(valores[i]);
		}
		System.out.println("el valor de los numeros agregados es : " + Clase1Suma.acumulador);
		
		System.out.println("\n----------- FIN PRUEBA Clase1Suma --------------\n");
		//-----------  FIN PRUEBA Clase1Suma --------------
	
		//---------- INICIO PRUEBA Clase2Resta -------------
		
		System.out.println("\n----------- INICIO PRUEBA Clase2Resta --------------\n");
		// Prueba Clase2Resta
		int int1 = 150000;
		int int2 = 12356;
		double double1 = 136531.536944;
		double double2 = 478931.123568;
		double double3 = 1323231.268944;
		
		//Prueba del método restaNumReal con 2 parámetros
		System.out.println("Prueba del método restaNumReal con 2 parámetros: " + Clase2Resta.restaNumReal(double1, double2));
		
		//Prueba del método restaNumEnt
		System.out.println("\nPrueba del método restaNumEnt: " + Clase2Resta.restaNumEnt(int1, int2));
		
		//Prueba del método restaNumReal con 3 parámetros
		System.out.println("\nPrueba del método restaNumReal con 3 parámetros: " + Clase2Resta.restaNumReal(double1, double2, double3));
		
		//Prueba del método acumular
		System.out.println("\nPrueba del método acumular. Añadiendo valores al acumulador...");
		double [] param = {17.254564564, -3123156.2564, 15464654,313216};
		for (int i=0; i < param.length; i++) {
			System.out.println("Añadimos al acumulador el valor: " + param[i]);
			Clase2Resta.acumular(param[i]);			
		}
		System.out.println("El valor total acumulado es: " + Clase2Resta.acumulado);
		
		System.out.println("\n----------- FIN PRUEBA Clase2Resta --------------\n");
				
		//-----------  FIN PRUEBA Clase2Resta --------------
	
		//---------- INICIO PRUEBA Clase3Producto -------------
		
		System.out.println("\n----------- INICIO PRUEBA Clase3Producto --------------\n");
		//Variables para Clae3Producto y Clase4Cociente
		double real1 = 25.67;
		double real2 = 4.78;
		double ent1 = 6;
		double ent2 = 2;
		double zero = 0;
		double nan = Double.NaN;
		double masInf = Double.POSITIVE_INFINITY;
		double menInf = Double.NEGATIVE_INFINITY;
		
		// Prueba Clase3Producto
		System.out.println("Prueba multiplicarEntero:" + Clase3Producto.multiplicarEntero(-2, 4)  );
		System.out.println("Prueba multiplicarDouble: " + Clase3Producto.multiplicarDouble(masInf, ent2));
		System.out.println("Prueba multiplicar3: " + Clase3Producto.multiplicar3(real2, ent1, real1));
		System.out.println("Prueba Potencia: " + Clase3Producto.potencia(1, 5));
		
		System.out.println("\n----------- FIN PRUEBA Clase3Producto --------------\n");

		//-----------  FIN PRUEBA Clase3Producto --------------
		
		//---------- INICIO PRUEBA Clase4Cociente -------------
		
		System.out.println("\n----------- INICIO PRUEBA Clase4Cociente --------------\n");
		// Prueba Clase4Cociente
		
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
		
		System.out.println("\n----------- FIN PRUEBA Clase4Cociente --------------\n");
		//-----------  FIN PRUEBA Clase4Cociente --------------
	}

}
