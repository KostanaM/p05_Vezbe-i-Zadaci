package UUP;

import java.util.Scanner;

public class Trougao {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.print("Unesite vrednost za x: ");
		int x = ulaz.nextInt();

		System.out.print("Unesite vrednost za y: ");
		int y = ulaz.nextInt();

		System.out.print("Unesite vrednost za z: ");
		int z = ulaz.nextInt();

		boolean p = (x + y > z) && (x + z > y) && (y + z > y);
		System.out.println("p= " + p);

		ulaz.close();
	}

}
