package UUP;

import java.util.Scanner;

public class Vezba4 {

	public static void main(String[] args) {
		int a, b, c, V, P;

		Scanner ulaz = new Scanner(System.in);

		System.out.print("Unesite stranicu a: ");
		a = ulaz.nextInt();

		System.out.print("Unesite stranicu b: ");
		b = ulaz.nextInt();

		System.out.print("Unesite stranicu c: ");
		c = ulaz.nextInt();

		V = a * b * c;
		P = 2 * (a * b + a * c + b * c);
		System.out.println("--------------------------------------------------");
		System.out.println("Površina kvadra je: " + P + " dok je zapremina kvadra: " + V);

		ulaz.close();
	}

}
