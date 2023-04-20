package UUP;

import java.util.Scanner;

public class Zamena {

	public static void main(String[] args) {
		int x, y, temp;

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Dva broja: x, y ");
		x = ulaz.nextInt();
		y = ulaz.nextInt();

		System.out.println("Pre zamene je x= " + x + " i y= " + y);
		temp = x;
		x = y;
		y = temp;

		System.out.println("Posle zamene je x= " + x + " i y= " + y);

		ulaz.close();
	}

}
