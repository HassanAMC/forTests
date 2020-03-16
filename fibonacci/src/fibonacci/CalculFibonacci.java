package fibonacci;

public class CalculFibonacci {

	/**
	 * Cette fonction permet de calculer la Fibonacci d'un nombre
	 */

	public static int fubo(int n) {
		if (n <= 1)
			return n;

		else
			return fubo(n - 1) + fubo(n - 2);

	}

	public static void main(String[] args) {

		System.out.println("La fonction : ");
		System.out.println(fubo(29));

	}
}
