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

class Clase1SumaTest {

	@Test
	void testSumaNumReal1() {
		double resultado = Clase1Suma.sumaNumReal(12345.67, 76543.21);
		double resultadoEsperado = 88888.88;
		assertEquals(resultado, resultadoEsperado, 0.01);
	}
	
	@Test
	void testSumaNumRealInfinito() {
		double resultado = Clase1Suma.sumaNumReal(1, Double.POSITIVE_INFINITY);
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado, 0.01);
	}

	@Test
	void testSumaNumEnt1() {
		int resultado = Clase1Suma.sumaNumEnt(1234567, 7654321);
		int resultadoEsperado = 8888888;
		assertEquals(resultado, resultadoEsperado, 0);
	}

	@Test
	void testSumaNumRealTresSumadosInfinito() {
		double resultado = Clase1Suma.sumaNumReal(1, 1, Double.POSITIVE_INFINITY);
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		assertEquals(resultado, resultadoEsperado, 0.01);
	}

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
