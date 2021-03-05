package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Clase2Resta;


class TestClase2Resta {
		
		/**
		 * Clase para hacer los test de JUnit de la Clase2Resta de la claculadora realizadar por el compañero @Alfonso
		 * 
		 * @author Rafa
		 * @since 20201/02/28
		 * 
		 */

		
		//Inicio test de la  clase, primer método  restaNumReal
		

		//test para comprobar la resta de dos valores reales
		@Test
		void testrestaNumRealDosValores() {
			double rest1 = Clase2Resta.restaNumReal(5.5, 0.5);
			double rest1esperado = 5;
			assertEquals(rest1,rest1esperado);
			
		}
		
		//test para valor Double.MAX_VALUE y restarle 1 numero que lo supere
		@Test
		void testrestaNumRealMaxValue(){
			double rest1=Clase2Resta.restaNumReal(Double.MAX_VALUE, -5);
			double rest1esperado = Double.MAX_VALUE;
			assertEquals(rest1,rest1esperado);
		}
		
		//test para valor -Double.MAX_VALUE y restarle un valor que lo supere
		@Test
		void testrestaNumRealMinValue(){
			double rest1=Clase2Resta.restaNumReal(-Double.MAX_VALUE, 5);
			double rest1esperado = -Double.MAX_VALUE;
			assertEquals(rest1,rest1esperado);
		}
		
		//test usando 1 valor como infinito y otro valor que lo resta
		@Test
		void testrestaNumRealPositiveInfinity(){
			double rest1=Clase2Resta.restaNumReal(Double.POSITIVE_INFINITY, -1);
			double rest1esperado = Double.POSITIVE_INFINITY;
			assertEquals(rest1,rest1esperado);
		}
		//test usando 1 valor como menos infinito y otro valor que lo resta
		@Test
		void testrestaNumRealNegativeInfinity() {
			double rest1 = Clase2Resta.restaNumReal(Double.NEGATIVE_INFINITY, -1);
			double rest1esperado = Double.NEGATIVE_INFINITY;
			assertEquals(rest1, rest1esperado);
		}
		
		
		
		//test segundo método de la clase resta, restaNumEnt
		
		//test para verificar la resta de dos numeros enteros
		@Test
		void testrestaNumEntDosValores() {
			int rest1 = Clase2Resta.restaNumEnt(10, -20);
			int rest1esperado = 30;
			assertEquals(rest1, rest1esperado);
		}
		//test para valor Double.MAX_VALUE y restarle 1 numero que lo cargue
		@Test
		void testrestaNumEntMaxValue(){
			int rest1=Clase2Resta.restaNumEnt(Integer.MAX_VALUE, -5);
			int rest1esperado = Integer.MAX_VALUE;
			assertEquals(rest1,rest1esperado);
		}
		
		//test para valor Double.MIN_VALUE y restarle un valor que los cargue
		@Test
		void testrestaNumEntMinValue(){
			int rest1=Clase2Resta.restaNumEnt(Integer.MIN_VALUE, 5);
			int rest1esperado = Integer.MIN_VALUE;
			assertEquals(rest1,rest1esperado);
		}
		
		
		//inicio test del tercer metodo restaNumReala3
		
		@Test
		//test para verificar la resta de tres numeros reales
		void testrestaNumReal3Valores() {
			double restade3= Clase2Resta.restaNumReal(500.69, 30.78, -30.78);
			double restade3esperado = 500.69;
			assertEquals(restade3, restade3esperado, 0.01);
			
		}
		
		//test para probar el overflow superior
		@Test
		void testrestaNumReal3ValoresMaxValue(){
			double rest1=Clase2Resta.restaNumReal(Double.MAX_VALUE, -5, 2);
			double rest1esperado = Double.MAX_VALUE;
			assertEquals(rest1,rest1esperado);
		}
		
		//test para probar el overflow inferior
		@Test
		void testrestaNumReal3ValoresMinValue(){
			double rest1=Clase2Resta.restaNumReal(-Double.MAX_VALUE, 5, 3);
			double rest1esperado = -Double.MAX_VALUE;
			assertEquals(rest1,rest1esperado);
		}
		
		//test Restar a Infinito Positivo 2 números
		@Test
		void testrestaNumReal3ValoresPositiveInfinity(){
			double rest1=Clase2Resta.restaNumReal(Double.POSITIVE_INFINITY, -1, 2);
			double rest1esperado = Double.POSITIVE_INFINITY;
			assertEquals(rest1,rest1esperado);
		}
		//test Restar a Infinito Negativo 2 números
		@Test
		void testrestaNumReal3ValoresNegativeInfinity() {
			double rest1 = Clase2Resta.restaNumReal(Double.NEGATIVE_INFINITY, -1, 2);
			double rest1esperado = Double.NEGATIVE_INFINITY;
			assertEquals(rest1, rest1esperado);
		}
		
		// Caso Acumula 4 números y recupera Acumulador
		@Test
		void testAcumulador() {
			double resultado = 0;
			double acumulado = 0;
			double resultadoEsperado=10;
			double[] numeros = {1,2,3,4};
			for (int i=0;i<numeros.length;i++) {
				acumulado = Clase2Resta.acumular(numeros[i]);
			}
			resultado = Clase2Resta.getAcumulador();
			
			assertEquals(resultado, resultadoEsperado, 0.01);
		}

		// Caso Poner a cero Acumulador
		@Test
		void testSumatorioPonerACero() {
			double resultado;
			double resultadoEsperado=0;
			Clase2Resta.resetAcumulador();
			resultado = Clase2Resta.getAcumulador();
			
			assertEquals(resultado, resultadoEsperado);
		}
	}

