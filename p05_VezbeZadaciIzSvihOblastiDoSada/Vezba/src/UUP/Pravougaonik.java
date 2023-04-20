package UUP;

import java.util.Scanner;

public class Pravougaonik {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.print("Unesite vrednost za a: ");
		int a = ulaz.nextInt();

		System.out.print("Unesite vrednost za b: ");
		int b = ulaz.nextInt();

		System.out.print("Unesite vrednost za c: ");
		int c = ulaz.nextInt();

		System.out.print("Unesite vrednost za d: ");
		int d = ulaz.nextInt();

		boolean p = ((a < c) && (b < d)) || ((a < d) && (b < c));
		System.out.println("p= " + p);

		ulaz.close();

	}

}
