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
		
		
		//test para comprobar la resta de dos valores reales
		 void testrestaNumReal() {
			double rest1 = Clase2Resta.restaNumReal(5.5, 0.5);
			double rest1esperado = 5;
			assertEquals(rest1,rest1esperado);
			
		}
		
		@Test
		//test para verificar la resta de dos numeros enteros
		void testrestaNumEnt() {
			int rest1 = Clase2Resta.restaNumEnt(10, -20);
			int rest1esperado = 30;
			assertEquals(rest1, rest1esperado);
		}
		
		@Test
		//test para verificar la resta de tres numeros reales
		void testrestaNumReala3() {
			double restade3= Clase2Resta.restaNumReal(30.78, 500.69, -30.78);
			double restade3esperado = 500.69;
			assertEquals(restade3, restade3esperado);
			
		}
		
		@Test
		//test para verificar el 
		void testacumulador() {
		//	double valoresacumulados = Clase2Resta.acumular();
		//	double resultadoesperado= Clase2Resta;
			
		
		}
	


}
