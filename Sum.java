package college;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int n;
		int sum = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
			n = n / 10;

		}

		System.out.println(sum);

	}

}
