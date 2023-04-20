package UUP;

import java.io.*;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak1 {

	public static void main(String[] args) throws Exception {

		double x, y, z, f;

		DecimalFormat df = new DecimalFormat("#.##");

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite vrednost promenjive x: ");
		x = Double.parseDouble(ulaz.readLine());

		System.out.print("Unesite vrednost promenjive y: ");
		y = Double.parseDouble(ulaz.readLine());

		System.out.print("Unesite vrednost promenjive z: ");
		z = Double.parseDouble(ulaz.readLine());

		f = ((x + y) * (x + z) * Math.sin(x)) / (2 * x - y);
		System.out.print("Vrednost promenjive f: " + df.format(f));
	}

}
