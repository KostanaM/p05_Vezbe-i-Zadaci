package UUP;

import java.util.Scanner;

public class LogickiIzraz {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.print("Unesite vrednost za x: ");
		boolean x = ulaz.nextBoolean();

		System.out.print("Unesite vrednost za y: ");
		boolean y = ulaz.nextBoolean();

		boolean z = !!(x && y) || x && y;
		System.out.println("z= " + z);

		ulaz.close();
	}

}
