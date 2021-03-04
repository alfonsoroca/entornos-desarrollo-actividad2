package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

import calculadora.Clase1Suma;

/**
 * Clase que testea la clase Clase1Suma y sus diferentes métodos
 * 
 * @author Jorge
 *
 */
class TestClase1Suma {

	/*******************************************
	 * Pruebas sobre Clase1Suma.sumaNumReal(d,d)
	 *******************************************/
	
	// Caso Normal de suma de 2 números reales
	@Test
	void testSumaNumRealCasoNormal() {
		double resultado = Clase1Suma.sumaNumReal(12345.67, 76543.21);
		double resultadoEsperado = 88888.88;
		assertEquals(resultado, resultadoEsperado, 0.01);
	}
	
	// Caso Sumando Infinito Positivo, Resultado Infinito Positivo
	@Test
	void testSumaNumRealInfinitoPositivo() {
		double resultado = Clase1Suma.sumaNumReal(1, Double.POSITIVE_INFINITY);
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado);
	}
	
	// Caso Sumando Infinito Negativo, Resultado Infinito Negativo
	@Test
	void testSumaNumRealInfinitoNegativo() {
		double resultado = Clase1Suma.sumaNumReal(1, Double.NEGATIVE_INFINITY);
		double resultadoEsperado = Double.NEGATIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado);
	}

	// Caso Sumandos Infinto Positivo y Negativo, Resultado NaN
	@Test
	void testSumaNumRealInfinitoMenosInfinitoIgualNaN() {
		double resultado = Clase1Suma.sumaNumReal(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		double resultadoEsperado = Double.NaN;
		assertEquals(resultado, resultadoEsperado);
	}
	
	//Caso Sumando NaN, Resultado NaN
	@Test
	void testNumRealNaN() {
		double resultado = Clase1Suma.sumaNumReal(Double.NaN, 1);
		double resultadoEsperado = Double.NaN;
		assertEquals(resultado, resultadoEsperado);
	}
	
	
	/******************************************
	 * Pruebas sobre Clase1Suma.sumaNumEnt(i,i)
	 ******************************************/
	// Caso Normal de suma de 2 enteros
	@Test
	void testSumaNumEntCasoNormal() {
		int resultado = Clase1Suma.sumaNumEnt(1234567, 7654321);
		int resultadoEsperado = 8888888;
		assertEquals(resultado, resultadoEsperado);
	}
	
	// Caso Suma mayor que Integer.MAX_VALUE, Resultado Integer.MAX_VALUE
	@Test
	void testSumaNumEntInfinitoPositivo() {
		int resultado = Clase1Suma.sumaNumEnt(1, Integer.MAX_VALUE);
		int resultadoEsperado = Integer.MAX_VALUE;
		assertEquals(resultado, resultadoEsperado);
	}
	
	// Caso Suma menor que Integer.MIN_VALUE, Resultado Integer.MIN_VALUE
	@Test
	void testSumaNumEntInfinitoNegativo() {
		int resultado = Clase1Suma.sumaNumEnt(-1, Integer.MIN_VALUE);
		int resultadoEsperado = Integer.MIN_VALUE;
		assertEquals(resultado, resultadoEsperado);
	}
	
	
	/*********************************************
	 * Pruebas sobre Clase1Suma.sumaNumReal(d,d,d)
	 *********************************************/
	// Caso Normal de suma de 3 números reales
	@Test
	void testSumaNumRealTresSumandosCasoNormal() {
		double resultado = Clase1Suma.sumaNumReal(11111.11, 22222.22, 33333.33);
		double resultadoEsperado = 66666.66;
		assertEquals(resultado, resultadoEsperado, 0.01);
	}
	
	// Caso Sumando Infinito Positivo, Resultado Infinito Positivo
	@Test
	void testSumaNumRealTresSumandosInfinitoPositivo() {
		double resultado = Clase1Suma.sumaNumReal(1, Double.POSITIVE_INFINITY, 1);
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado);
	}
	
	// Caso Sumando Infinito Negativo, Resultado Infinito Negativo
	@Test
	void testSumaNumRealTresSumandosInfinitoNegativo() {
		double resultado = Clase1Suma.sumaNumReal(-1, Double.NEGATIVE_INFINITY, -1);
		double resultadoEsperado = Double.NEGATIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado);
	}

	// Caso Al menos 2 Sumandos son Infinto Positivo y Negativo, Resultado NaN
	@Test
	void testSumaNumRealTresSumandosInfinitoMenosInfinitoIgualNaN() {
		double resultado = Clase1Suma.sumaNumReal(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, 20000);
		double resultadoEsperado = Double.NaN;
		assertEquals(resultado, resultadoEsperado);
	}
	
	
	// Caso Sumado NaN, Resultado NaN
	@Test
	void testSumaNumRealTresSumandosNaN() {
		double resultado = Clase1Suma.sumaNumReal(1, Double.NaN, 0);
		double resultadoEsperado = Double.NaN;
		assertEquals(resultado, resultadoEsperado);
	}
	
	/**************************************
	 * Pruebas sobre Clase1Suma.sumatorio()
	 **************************************/
	
	// Caso Acumula 4 números y recupera Acumulador
	@Test
	void testSumatorio() {
		double resultado=0;
		double sumatorio=0;
		double resultadoEsperado=10;
		double[] numeros = {1,2,3,4};
		for (int i=0;i<numeros.length;i++) {
			sumatorio = Clase1Suma.sumatorio(numeros[i]);
		}
		resultado = Clase1Suma.getAcumulador();
		
		assertEquals(resultado, resultadoEsperado, 0.01);
	}

	// Caso Poner a cero Acumulador
	@Test
	void testSumatorioPonerACero() {
		double resultado;
		double resultadoEsperado=0;
		Clase1Suma.resetAcumulador();
		resultado = Clase1Suma.getAcumulador();
		
		assertEquals(resultado, resultadoEsperado);
	}
}
