package UUP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak3 {

	public static void main(String[] args) throws Exception {

		double a, p, v;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite stranicu kocke a: ");
		a = Double.parseDouble(ulaz.readLine());

		p = 6 * a * a;
		v = a * a * a;
		System.out.println("Za unetu vrednost kocke a= " + a + "izracunata povrsina je " + p + "a zapremina je " + v);

	}

}
