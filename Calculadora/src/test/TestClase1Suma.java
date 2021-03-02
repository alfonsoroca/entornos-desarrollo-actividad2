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
	
	// Caso Resultado Infinito Positivo
	@Test
	void testSumaNumRealInfinitoPositivo() {
		double resultado = Clase1Suma.sumaNumReal(1, Double.POSITIVE_INFINITY);
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado);
	}
	
	// Caso Resultado Infinito Negativo
	@Test
	void testSumaNumRealInfinitoNegativo() {
		double resultado = Clase1Suma.sumaNumReal(-1, Double.NEGATIVE_INFINITY);
		double resultadoEsperado = Double.NEGATIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado);
	}

	// Caso Resultado NaN
	@Test
	void testSumaNumRealNaN() {
		double resultado = Clase1Suma.sumaNumReal(1, Double.NaN);
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
	
	// Caso Resultado mayor que Integer.MAX_VALUE
	@Test
	void testSumaNumEntInfinitoPositivo() {
		int resultado = Clase1Suma.sumaNumEnt(1, Integer.MAX_VALUE);
		int resultadoEsperado = Integer.MAX_VALUE;
		assertEquals(resultado, resultadoEsperado);
	}
	
	// Caso Resultado menor que Integer.MIN_VALUE
	@Test
	void testSumaNumEntInfinitoNegativo() {
		int resultado = Clase1Suma.sumaNumEnt(-1, Integer.MIN_VALUE);
		int resultadoEsperado = Integer.MIN_VALUE;
		assertEquals(resultado, resultadoEsperado);
	}
	
	/*********************************************
	 * Pruebas sobre Clase1Suma.sumaNumReal(d,d,d)
	 *********************************************/
	// Caso Normal de suma de 2 números reales
	@Test
	void testSumaNumRealTresSumandosCasoNormal() {
		double resultado = Clase1Suma.sumaNumReal(11111.111, 22222.222, 33333.333);
		double resultadoEsperado = 66666.66;
		assertEquals(resultado, resultadoEsperado, 0.01);
	}
	
	// Caso Resultado Infinito Positivo
	@Test
	void testSumaNumRealTresSumandosInfinitoPositivo() {
		double resultado = Clase1Suma.sumaNumReal(1, Double.POSITIVE_INFINITY, 1);
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado);
	}
	
	// Caso Resultado Infinito Negativo
	@Test
	void testSumaNumRealTresSumandosInfinitoNegativo() {
		double resultado = Clase1Suma.sumaNumReal(-1, Double.NEGATIVE_INFINITY, -1);
		double resultadoEsperado = Double.NEGATIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado);
	}

	// Caso Resultado NaN
	@Test
	void testSumaNumRealTresSumandosNaN() {
		double resultado = Clase1Suma.sumaNumReal(1, Double.NaN, 0);
		double resultadoEsperado = Double.NaN;
		assertEquals(resultado, resultadoEsperado);
	}
	
	/**************************************
	 * Pruebas sobre Clase1Suma.sumatorio()
	 **************************************/
	@Test
	void testSumatorio() throws IOException {
		double resultado=0;
		double resultadoEsperado;
		double[] numeros = {1,2,3,4};
		/*
		InputStream sysInBackup = System.in; // backup System.in to restore it later
		
		ByteArrayOutputStream datos = new ByteArrayOutputStream();
		DataOutputStream out = new DataOutputStream(datos);
		for(int i=0;i<numeros.length;i++) {
			out.writeDouble(numeros[i]);
		}
		InputStream input = new ByteArrayInputStream(datos.toByteArray());
		System.setIn(input);
		*/
		resultado = Clase1Suma.sumatorio();
		resultadoEsperado = 3;
		//System.setIn(sysInBackup);
		assertEquals(resultado, resultadoEsperado, 0.01);

	}

}
