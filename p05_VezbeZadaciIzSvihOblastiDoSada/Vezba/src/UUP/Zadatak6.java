package UUP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak6 {

	public static void main(String[] args) throws Exception {

		double d, n;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite dijagonalu ekrana u inčama: ");
		n = Double.parseDouble(ulaz.readLine());

		d = n * 2.54;
		System.out.print("Dijagonala ekrana u centimetrima je " + d);

	}

}
