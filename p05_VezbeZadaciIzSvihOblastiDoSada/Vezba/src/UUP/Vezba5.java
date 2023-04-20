package UUP;

import java.text.DecimalFormat;

public class Vezba5 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.##");

		double a = 4;
		double b = 4;
		double c = 4;

		double l = Math.sqrt(b * c * (Math.pow((b + c), 2)) - a * a) / (b + c);
		System.out.println("l je: " + df.format(l));

		double m = Math.sqrt(2 * (b * b + c * c) - a * a) / 2;
		System.out.println("m je: " + df.format(m));

	}

}
