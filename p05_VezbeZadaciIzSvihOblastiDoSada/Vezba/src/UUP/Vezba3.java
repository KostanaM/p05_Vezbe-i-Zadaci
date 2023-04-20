package UUP;

import java.text.DecimalFormat;

public class Vezba3 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		double a = 100;
		double b = 20;
		double c = 30;

		double f = (a - b) / (c + a / (c + (b / (c - b))));
		System.out.println("Vrednost je: " + df.format(f));

		double g = (a + b + Math.sin(a)) * Math.cos(c);
		System.out.println("Vrednost je: " + df.format(g));

	}

}
