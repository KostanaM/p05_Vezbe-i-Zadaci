package UUP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak2 {

	public static void main(String[] args) throws Exception {
		double x;
		boolean y;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite vrednost za x: ");
		x = Double.parseDouble(ulaz.readLine());

		y = Math.sqrt((2 + x - Math.pow(x, 3)) / (x + 2)) > 0 || Math.exp(x) < x - 1 && Math.sqrt(x - 1) <= 0;
		System.out.print("Vrednost funckije y je " + y);

	}

}
