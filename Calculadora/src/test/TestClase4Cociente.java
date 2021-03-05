package test;

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

import calculadora.Clase4Cociente;

class TestClase4Cociente {

	/*
	 * Comprobacion metodo divisionReales
	 */

	@Test
	void testDivisionRealesInfinitoPostivo() {

		double obtenido = Clase4Cociente.divisionReales(5.5, 2);
		double esperado = 2.75;

		assertEquals(obtenido, esperado);
	}

	/*
	 * Comprobacion metodo divisionReales con numero negativo
	 */
	@Test
	void testDivisionRealesDividendoNegativo() {

		double obtenido = Clase4Cociente.divisionReales(-5, 5);
		double esperado = -1;
		assertEquals(obtenido, esperado);
	}

	/*
	 * Comprobacion metodo divisionReales con Divisor 0
	 */
	@Test
	void testDivisionRealesDivisor0() {

		double obtenido = Clase4Cociente.divisionReales(5, 0);
		double esperado = Double.POSITIVE_INFINITY;
		assertEquals(obtenido, esperado);
	}

	/*
	 * Comprobacion metodo divisionesReales con ambos parameros a 0
	 */
	@Test
	void testDivisionRealesParametros0() {

		double obtenido = Clase4Cociente.divisionReales(0, 0);
		double esperado = Double.NaN;
		assertEquals(obtenido, esperado);
	}

	/*
	 * Comprobacion metodo divisionEnteros
	 * 
	 * comprobacion divisonEnteros con ambos parametros a 0
	 */

	@Test
	void testDivisionEnteros() {
		double obtenido = Clase4Cociente.divisionEnteros(0, 0);
		double esperado = Double.NaN;
		assertEquals(obtenido, esperado);
	}

	/*
	 * Comprobacion divisionEnteros Not-a-Number
	 */
	@Test
	void testDivisionEnterosNaN() {
		double obtenido = Clase4Cociente.divisionEnteros(Double.NaN, Double.NaN);
		double esperado = Double.NaN;
		assertEquals(obtenido, esperado);
	}

	/*
	 * Comprobacion divisionEnteros Dividendo Infinito positivo.
	 */
	@Test
	void testDivisionEnterosinfinitoNaN() {
		double obtenido = Clase4Cociente.divisionEnteros(Double.POSITIVE_INFINITY, 2);
		double esperado = Double.POSITIVE_INFINITY;
		assertEquals(obtenido, esperado);
	}

	/*
	 * Comprobacion divisionEnteros Divisor 0.
	 */
	@Test
	void testDivisionEnterosinfinitDivisor0() {
		double obtenido = Clase4Cociente.divisionEnteros(8, 0);
		double esperado = Double.POSITIVE_INFINITY;
		assertEquals(obtenido, esperado);
	}

	/*
	 * Comprobacion Inverso 
	 */
	@Test
	void testInverso() {
		double obtenido = Clase4Cociente.inverso(5);
		double esperado = 0.2;
		assertEquals(obtenido, esperado);
	}

	/*
	 * Comprobacin Inverso parametro 0.
	 */
	@Test
	void testInverso0() {
		double obtenido = Clase4Cociente.inverso(0);
		double esperado = Double.POSITIVE_INFINITY;
		assertEquals(obtenido, esperado);
	}

	/*
	 * Comprobacion Inverso Not-a-Number
	 */
	@Test
	void testInversoNegativo() {
		double obtenido = Clase4Cociente.inverso(Double.NaN);
		double esperado = Double.NaN;
		assertEquals(obtenido, esperado);
	}
	
	/*
	 * Comprobacion Inverso Infinito Positivo
	 */
	@Test
	void testInversoInfinitoPositivo() {
		double obtenido = Clase4Cociente.inverso(Double.POSITIVE_INFINITY);
		double esperado = 0.0;
		assertEquals(obtenido, esperado);
	}
	
	/*
	 * Comprobacion Inverso Infinito Negativo
	 */
	@Test
	void testInversoInfinitoNegativo() {
		double obtenido = Clase4Cociente.inverso(Double.NEGATIVE_INFINITY);
		double esperado = -0.0;
		assertEquals(obtenido, esperado);
	}
	
	
	/*
	 * comprobacion raizCuadrada
	 */
	@Test
	void testRaizCuadrada() {
		double obtenido = Clase4Cociente.raizCuadrada(2.5);
		double esperado = 1.5811388300841898;
		assertEquals(obtenido, esperado);
	}

	/*
	 * Comprobacion raizCuadrada Infinito Positivo
	 */
	@Test
	void testRaizCuadradaInfinita() {
		double obtenido = Clase4Cociente.raizCuadrada(Double.POSITIVE_INFINITY);
		double esperado = Double.POSITIVE_INFINITY;
		assertEquals(obtenido, esperado);
	}
	
	
	/*
	 * Comprobacion raizCuadrada Infinito Negativo.
	 */
	@Test
	void testRaizCuadradaInfinitaNegativa() {
		double obtenido = Clase4Cociente.raizCuadrada(Double.NEGATIVE_INFINITY);
		double esperado = Double.NaN;
		assertEquals(obtenido, esperado);
	}

	/*
	 * Comprobacion raizCuadrada 0
	 */
	@Test
	void testRaizCuadrada0() {
		double obtenido = Clase4Cociente.raizCuadrada(0);
		double esperado = 0;
		assertEquals(obtenido, esperado);
	}

	/*
	 * Comprobacion raizCuadrada Numero Negativo.
	 */
	@Test
	void testRaizCuadradaNegativo() {
		double obtenido = Clase4Cociente.raizCuadrada(-4);
		double esperado = Double.NaN;
		assertEquals(obtenido, esperado);
	}
}
