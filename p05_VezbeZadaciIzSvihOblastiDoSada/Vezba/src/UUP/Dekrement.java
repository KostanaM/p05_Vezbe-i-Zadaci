package UUP;

public class Dekrement {

	public static void main(String[] args) {

		int i = 3;
		int j = 4;

		// Zadatak pod a)
		/*
		 * System.out.println("i= " + i + " j= " + j); j = 3 + --i;
		 * System.out.println("i= " + i + " j= " + j);
		 */

		// Zadatak pod b)
		System.out.println("\ni= " + i + " j= " + j);
		j = 3 + i--;
		System.out.println("i= " + i + " j= " + j);

	}

}
