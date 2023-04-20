package UUP;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.##");

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite promenjivu x: ");
		double x = ulaz.nextDouble();

		double y = Math.sqrt((Math.exp(x / 2) + 1.2 * Math.sin(2 * x)) / (3.3 * Math.cos(x) + 7.1 * Math.exp(x)));
		System.out.println("Y je " + df.format(y));

		ulaz.close();
	}

}
