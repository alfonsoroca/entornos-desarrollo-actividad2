package calculadora;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author cesar
 * 
 * 	 He cambiado los metodos a Static para poder realizar pruebas.
 * 	 una de las pruebas ha salido como Failure
 * 		TestDivisionRealesDivisor0.
 * 
 * 			
 */

import org.junit.jupiter.api.Test;

class TestClase4Cociente {



	@Test
	void testDivisionRealesInfinitoPostivo() {

		double obtenido = Clase4Cociente.divisionReales(5.5, 2);
		double esperado = 2.75;

		assertEquals(obtenido, esperado);
	}

	@Test
	void testDivisionRealesDividendoNegativo() {

		double obtenido = Clase4Cociente.divisionReales(-5, 5);
		double esperado = -1;
		assertEquals(obtenido, esperado);
	}

	// Salta el mensaje pero en el test sale error ( Failure) .
	@Test
	void testDivisionRealesDivisor0() {

		double obtenido = Clase4Cociente.divisionReales(5, 0);
		double esperado = Double.NaN;
		assertEquals(obtenido, esperado);
	}

	/*
	 * Test Division enteros
	 */

	@Test
	void testDivisionEnteros() {
		double obtenido = Clase4Cociente.divisionEnteros(0, 0);
		double esperado = Double.NaN;
		assertEquals(obtenido, esperado);
	}

	@Test
	void testDivisionEnterosNaN() {
		double obtenido = Clase4Cociente.divisionEnteros(Double.NaN, Double.NaN);
		double esperado = Double.NaN;
		assertEquals(obtenido, esperado);
	}

	@Test
	void testDivisionEnterosinfinitoNaN() {
		double obtenido = Clase4Cociente.divisionEnteros(Double.POSITIVE_INFINITY, 2);
		double esperado = Double.POSITIVE_INFINITY;
		assertEquals(obtenido, esperado);
	}

	/*
	 * Teste Inverso
	 */
	@Test
	void testInverso() {
		double obtenido = Clase4Cociente.inverso(5);
		double esperado = 0.2;
		assertEquals(obtenido, esperado);
	}

	@Test
	void testInverso0() {
		double obtenido = Clase4Cociente.inverso(0);
		double esperado = Double.POSITIVE_INFINITY;
		assertEquals(obtenido, esperado);
	}

	@Test
	void testInversoNegativo() {
		double obtenido = Clase4Cociente.inverso(-5);
		double esperado = -0.2;
		assertEquals(obtenido, esperado);
	}

	@Test
	void testInversoInfinito() {
		double obtenido = Clase4Cociente.inverso(Double.POSITIVE_INFINITY);
		double esperado = 0;
		assertEquals(obtenido, esperado);
	}
	/*
	 * Test Raiz cuadrada
	 */

	// Failure
	@Test
	void testRaizCuadrada() {
		double obtenido = Clase4Cociente.raizCuadrada(2.5);
		double esperado = 1.58113883008419;
		assertEquals(obtenido, esperado);
	}
	
	@Test
	void testRaizCuadradaInfinita() {
		double obtenido = Clase4Cociente.raizCuadrada(Double.POSITIVE_INFINITY);
		double esperado = Double.POSITIVE_INFINITY;
		assertEquals(obtenido, esperado);
	}

	@Test
	void testRaizCuadradaInfinitaNegativa() {
		double obtenido = Clase4Cociente.raizCuadrada(Double.NEGATIVE_INFINITY);
		double esperado = Double.NaN;
		assertEquals(obtenido, esperado);
	}

	@Test
	void testRaizCuadrada0() {
		double obtenido = Clase4Cociente.raizCuadrada(0);
		double esperado = 0;
		assertEquals(obtenido, esperado);
	}

	@Test
	void testRaizCuadradaNegativo() {
		double obtenido = Clase4Cociente.raizCuadrada(-4);
		double esperado = Double.NaN;
		assertEquals(obtenido, esperado);
	}
}
