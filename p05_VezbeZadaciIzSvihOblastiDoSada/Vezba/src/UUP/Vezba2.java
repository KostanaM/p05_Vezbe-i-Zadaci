package UUP;

public class Vezba2 {

	public static void main(String[] args) {

		boolean x = true;
		boolean y = false;

		boolean z = !(x & y) | !x & y;
		System.out.println("Z je: " + z);

	}

}
