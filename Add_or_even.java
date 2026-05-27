package college;

import java.util.Scanner;

public class Add_or_even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");

		int a = sc.nextInt();
		for (int i = 0; i <= a; i++) {
			if (i % 2 != 0) {

				System.out.println(i);
			}

		}

	}

}
