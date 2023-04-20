package UUP;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		double m, v, BMI;

		Scanner ulaz = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");

		System.out.println("Unesite težinu osobe: ");
		m = ulaz.nextDouble();

		System.out.println("Unesite visinu osobe: ");
		v = ulaz.nextDouble();

		BMI = m / (v * v);
		System.out.println("BMI je " + df.format(BMI));

		ulaz.close();
	}

}
