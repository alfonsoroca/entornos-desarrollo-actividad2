package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Clase3Producto;

/**
 * Clase que testea la clase Clase3Producto y sus diferentes métodos
 * 
 * @author Alfonso
 *
 */

class TestClase3Producto {

	@Test
	/*
	 * Comprobando la multiplicación de dos números enteros
	 */
	void testMultiplicarEntero() {

		int res = Clase3Producto.multiplicarEntero(-10, 156565);
		int resEsperado = -1565650;
		assertEquals(resEsperado, res, "El resultado de la multiplicación de dos números enteros falla");

	}

	@Test
	/*
	 * Comprobando la multiplicación de cualquier número con infinito positivo
	 */
	void testMultiplicarDoubleInfinitoPositivo() {

		double res = Clase3Producto.multiplicarDouble(1, Double.POSITIVE_INFINITY);
		double resEsperado = Double.POSITIVE_INFINITY;
		assertEquals(resEsperado, res, "El resultado de la multiplicación de cualquier número con infinito positivo falla");

	}

	@Test
	/*
	 * Comprobando la multiplicación de cualquier número con infinito negativo
	 */
	void testMultiplicarDoubleInfinitoNegativo() {

		double res = Clase3Producto.multiplicarDouble(1, Double.NEGATIVE_INFINITY);
		double resEsperado = Double.NEGATIVE_INFINITY;
		assertEquals(resEsperado, res, "El resultado de la multiplicación de cualquier número con infinito negativo falla");

	}

	@Test
	/*
	 * Comprobando la multiplicación de varios números con infinito positivo
	 */
	void testMultiplicarVariosDoubleInfinitoPositivo() {

		double res = Clase3Producto.multiplicar3(1, 5, Double.POSITIVE_INFINITY);
		double resEsperado = Double.POSITIVE_INFINITY;
		assertEquals(resEsperado, res, "El resultado de la multiplicación de varios números con infinito positivo falla");

	}

	@Test
	/*
	 * Comprobando la multiplicación de varios números con infinito negativo
	 */
	void testMultiplicarVariosDoubleInfinitoNegativo() {

		double res = Clase3Producto.multiplicar3(1, 5, Double.NEGATIVE_INFINITY);
		double resEsperado = Double.NEGATIVE_INFINITY;
		assertEquals(resEsperado, res, "El resultado de la multiplicación de varios números con infinito negativo falla");

	}

	@Test
	/*
	 * Comprobando la potencia de cero elevado a infinito positivo
	 */
	void testPotenciaCeroElevadoInfinitoPositivo() {

		double res = Clase3Producto.potencia(0, Double.POSITIVE_INFINITY);
		double resEsperado = 0;
		assertEquals(resEsperado, res, "El resultado de la potencia de cero elevado a infinito positivo falla");

	}

	@Test
	/*
	 * Comprobando la potencia de cero elevado a infinito negativo
	 */
	void testPotenciaCeroElevadoInfinitoNegativo() {

		double res = Clase3Producto.potencia(0, Double.NEGATIVE_INFINITY);
		double resEsperado = Double.POSITIVE_INFINITY;
		assertEquals(resEsperado, res, "El resultado de la potencia de cero elevado a infinito negativo falla");

	}

	@Test
	/*
	 * Comprobando la potencia de infinito positivo elevado a infinito positivo
	 */
	void testPotenciaInfinitoPositivoElevadoInfinitoPositivo() {

		double res = Clase3Producto.potencia(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
		double resEsperado = Double.POSITIVE_INFINITY;
		assertEquals(resEsperado, res, "El resultado de la potencia de infinito positivo elevado a infinito positivo falla");

	}

	@Test
	/*
	 * Comprobando la potencia de infinito positivo elevado a infinito negativo
	 */
	void testPotenciaInfinitoPositivoElevadoInfinitoNegativo() {

		double res = Clase3Producto.potencia(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
		double resEsperado = 0.0;
		assertEquals(resEsperado, res, "El resultado de la potencia de infinito positivo elevado a infinito negativo falla");

	}

	@Test
	/*
	 * Comprobando la potencia de cero elevado a cero
	 */
	void testPotenciaCeroElevadoCero() {

		double res = Clase3Producto.potencia(0, 0);
		double resEsperado = 1.0;
		assertEquals(resEsperado, res, "El resultado de la potencia de cero elevado a cero falla");

	}

}
