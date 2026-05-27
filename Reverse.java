package college;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = S.nextInt();
		int rev = 0;
		while (n > 0) {
			rev = rev * 10;
			rev = rev + n % 10;
			n = n / 10;
		}
		System.out.println(rev);
	}
}
