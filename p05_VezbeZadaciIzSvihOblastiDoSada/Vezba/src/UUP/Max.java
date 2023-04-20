package UUP;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.print("Unesite vrednost za a: ");
		double a = ulaz.nextDouble();

		System.out.print("Unesite vrednost za b: ");
		double b = ulaz.nextDouble();

		double y = 5 + Math.max(a * a, b * b);
		System.out.println("y= " + y);

		ulaz.close();
	}

}
