package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * Clase que testea la clase Clase3Producto y sus diferentes métodos
 * @author Alfonso
 *
 */

class TestClase3Producto {

	@Test
	//Comprobando las multiplicaciones de dos números enteros
	void testMultiplicarEntero() {

		int resultado = Clase3Producto.multiplicarEntero(-10, 156565);
		int resultadoEsperado = -1565650;
		assertEquals(resultado, resultadoEsperado);

	}

	@Test
	// Comprobando la multiplicación con infinito positivo
	void testMultiplicarDoubleInfinitoPositivo() {
		double resultado = Clase3Producto.multiplicarDouble(1, Double.POSITIVE_INFINITY);
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado, "Infinity");

	}

	@Test
	// Comprobando la multiplicación con infinito negativo
	void testMultiplicarDoubleInfinitoNegativo() {
		double resultado = Clase3Producto.multiplicarDouble(1, Double.NEGATIVE_INFINITY);
		double resultadoEsperado = Double.NEGATIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado);

	}

	@Test
	// Comprobando la multiplicación de varios números con infinito positivo
	void testMultiplicarVariosDoubleInfinitoPositivo() {
		double resultado = Clase3Producto.multiplicar3(1, 5, Double.POSITIVE_INFINITY);
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado);

	}

	@Test
	// Comprobando la multiplicación de varios números con infinito negativo
	void testMultiplicarVariosDoubleInfinitoNegativo() {
		double resultado = Clase3Producto.multiplicar3(1, 5, Double.NEGATIVE_INFINITY);
		double resultadoEsperado = Double.NEGATIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado);

	}

	@Test
	// Comprobando la potencia de cero elevado a infinito positivo
	void testPotenciaCeroElevadoInfinitoPositivo() {
		double resultado = Clase3Producto.potencia(0, Double.POSITIVE_INFINITY);
		double resultadoEsperado = 0;
		assertEquals(resultado, resultadoEsperado);

	}

	@Test
	// Comprobando la potencia de cero elevado a infinito negativo
	void testPotenciaCeroElevadoInfinitoNegativo() {
		double resultado = Clase3Producto.potencia(0, Double.NEGATIVE_INFINITY);
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado);

	}

	@Test
	// Comprobando la potencia de infinito positivo elevado a infinito positivo
	void testPotenciaInfinitoPositivoElevadoInfinitoPositivo() {
		double resultado = Clase3Producto.potencia(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado);

	}
	
	@Test
	// Comprobando la potencia de infinito positivo elevado a infinito negativo
	void testPotenciaInfinitoPositivoElevadoInfinitoNegativo() {
		double resultado = Clase3Producto.potencia(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
		double resultadoEsperado = 0.0;
		assertEquals(resultado, resultadoEsperado);

	}

}
