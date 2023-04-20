package UUP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak4 {

	public static void main(String[] args) throws Exception {

		double a, b, c, s, p, R, r, d;

		DecimalFormat df = new DecimalFormat("#.##");

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Stanice trougla a: ");
		a = Double.parseDouble(ulaz.readLine());

		System.out.print("Stanice trougla b: ");
		b = Double.parseDouble(ulaz.readLine());

		System.out.print("Stanice trougla c: ");
		c = Double.parseDouble(ulaz.readLine());

		s = (a + b + c) / 2;
		p = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		R = (a * b * c) / (4 * p);
		r = (a * b * c) / (2 * R * s);
		d = Math.sqrt(R * (R - 2 * r));
		System.out.println("R =  " + df.format(R));
		System.out.println("r =  " + df.format(r));
		System.out.println("d =  " + df.format(d));

	}

}
