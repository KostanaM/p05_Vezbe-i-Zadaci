package UUP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak5 {

	public static void main(String[] args) throws Exception {

		int s, d, j, t, zbir;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite trocifreni broj t: ");

		t = Integer.parseInt(ulaz.readLine());

		// s = t / 100;
		// d = (t - 100) / 10;
		// j = t - 100 - d * 10;

		s = t / 100;
		d = (t % 100) / 10;
		j = t % 10;
		System.out.println("s= " + s + " d= " + d + " j= " + j);
		zbir = s + d + j;
		System.out.println("Zbir cifara trocifrenog broja " + t + " je " + zbir);

	}

}
