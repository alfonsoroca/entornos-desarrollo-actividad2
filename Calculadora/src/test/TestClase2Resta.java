package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Clase2Resta;

import static org.junit.jupiter.api.Assertions.assertEquals;

	import org.junit.*;


	class TestCalse2Resta {
		
		/**
		 * Clase para hacer los test de JUnit de la Clase2Resta de la claculadora realizadar por el compañero @Alfonso
		 * 
		 * @author Rafa
		 * @since 20201/02/28
		 * 
		 */

		@Test
		
	//Inicio test de la  clase, primer método  restaNumReal
		
		//test para comprobar la resta de dos valores reales
		 void testrestaNumReal() {
			double rest1 = Clase2Resta.restaNumReal(5.5, 0.5);
			double rest1esperado = 5;
			assertEquals(rest1,rest1esperado);
			
		}
		
		//test para valor Double.MAX_VALUE y restarle 1 numero que lo cargue
		void testrestaNumReal(){
			double rest1=Clase2Resta.restaNumRal(Double.MAX_VALUE, -5);
			double rest1esperado = Double.MAX_VALUE;
			assertEqual(rest1,rest1esperado);
		}
		
		//test para valor Double.MIN_VALUE y restarle un valor que los cargue
		void testrestaNumReal(){
			double rest1=Clase2Resta.restaNumRal(Double.MIN_VALUE, 5);
			double rest1esperado = Double.MIN_VALUE;
			assertEqual(rest1,rest1esperado);
		}
		
		//test usando 1 valor como infinito y otro valor que lo resta
		void testrestaNumReal(){
			double rest1=Clase2Resta.restaNumReal(Double.POSITIVE_INFINITY, -1);
			double rest1esperado = Double.POSITIVE_INFINITY;
			assertEquals(rest1,rest1esperado);
		}
		//test usando 1 valor como menos infinito y otro valor que lo resta
		void testrestaNumReal() {
			double rest1 = Clase2Resta.restaNumReal(Double.NEGATIVE_INFINITY, -1);
			double rest1esperado = Double.NEGATIVE_INFINITY;
			assertEquals(rest1, rest1esperado);
		}
		
		
		
	//test segundo método de la clase resta, restaNumEnt
		@Test
		//test para verificar la resta de dos numeros enteros
		void testrestaNumEnt() {
			int rest1 = Clase2Resta.restaNumEnt(10, -20);
			int rest1esperado = 30;
			assertEquals(rest1, rest1esperado);
		}
		//test para valor Double.MAX_VALUE y restarle 1 numero que lo cargue
		void testrestaNumReal(){
			int rest1=Clase2Resta.restaNumRal(Double.MAX_VALUE, -5);
			int rest1esperado = Double.MAX_VALUE;
			assertEqual(rest1,rest1esperado);
		}
		
		//test para valor Double.MIN_VALUE y restarle un valor que los cargue
		void testrestaNumReal(){
			int rest1=Clase2Resta.restaNumRal(Double.MIN_VALUE, 5);
			int rest1esperado = Double.MIN_VALUE;
			assertEqual(rest1,rest1esperado);
		}
		
		//test usando 1 valor como infinito y otro valor que lo resta
		void testrestaNumReal(){
			int rest1=Clase2Resta.restaNumReal(Double.POSITIVE_INFINITY, -1);
			int rest1esperado = Double.POSITIVE_INFINITY;
			assertEquals(rest1,rest1esperado);
		}
		//test usando 1 valor como menos infinito y otro valor que lo resta
		void testrestaNumReal() {
			int rest1 = Clase2Resta.restaNumReal(Double.NEGATIVE_INFINITY, -1);
			int rest1esperado = Double.NEGATIVE_INFINITY;
			assertEquals(rest1, rest1esperado);
		}
		
	//inicio test del tercer metodo restaNumReala3
		
		@Test
		//test para verificar la resta de tres numeros reales
		void testrestaNumReala3() {
			double restade3= Clase2Resta.restaNumReal(30.78, 500.69, -30.78);
			double restade3esperado = 500.69;
			assertEquals(restade3, restade3esperado);
			
		}
		
		//test para valor Double.MAX_VALUE y restarle 1 numero que lo cargue
		void testrestaNumReal(){
			double rest1=Clase2Resta.restaNumRal(Double.MAX_VALUE, -5, 2);
			double rest1esperado = Double.MAX_VALUE;
			assertEqual(rest1,rest1esperado);
		}
		
		//test para valor Double.MIN_VALUE y restarle un valor que los cargue
		void testrestaNumReal(){
			double rest1=Clase2Resta.restaNumRal(Double.MIN_VALUE, 5, 3);
			double rest1esperado = Double.MIN_VALUE;
			assertEqual(rest1,rest1esperado);
		}
		
		//test usando 1 valor como infinito y otro valor que lo resta
		void testrestaNumReal(){
			double rest1=Clase2Resta.restaNumReal(Double.POSITIVE_INFINITY, -1, 2);
			double rest1esperado = Double.POSITIVE_INFINITY;
			assertEquals(rest1,rest1esperado);
		}
		//test usando 1 valor como menos infinito y otro valor que lo resta
		void testrestaNumReal() {
			double rest1 = Clase2Resta.restaNumReal(Double.NEGATIVE_INFINITY, -1, 2);
			double rest1esperado = Double.NEGATIVE_INFINITY;
			assertEquals(rest1, rest1esperado);
		}
		
	
		
		
		@Test
		//test para verificar el 
		void testacumulador() {
		//	double valoresacumulados = Clase2Resta.acumular();
		//	double resultadoesperado= Clase2Resta;
			
		
		}
	


}
