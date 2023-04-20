package UUP;

import java.util.Scanner;

public class PretvoriSekunde {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.print("Unesite sate: ");
		int h = (int) ulaz.nextDouble();
		System.out.print("Unesite minute: ");
		int m = (int) ulaz.nextDouble();
		System.out.print("Unesite sekunde: ");
		int s = (int) ulaz.nextDouble();

		int sec = (h * 3600) + (m * 60) + s;
		System.out.print("Vreme izraženo u sekundama je : " + sec);
		ulaz.close();
	}

}
