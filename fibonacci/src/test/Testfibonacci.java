package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fibonacci.CalculFibonacci;

public class Testfibonacci {

	/**
	 * Cette methode permet de tester la fonctions qui est dans la class
	 * CalculFibonacci
	 */

	@Test
	public void testCalculFibonacci() {

		// tester la fonction
		assertEquals(5142290, CalculFibonacci.fubo(29));
	}
}