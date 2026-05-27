package college;

import java.util.Scanner;

public class fizz {
	public static void main(String[] args) {
		{
			Scanner s = new Scanner(System.in);
			System.out.println("enter a value");
			int a = s.nextInt();
			for (int i = 0; i < a; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("FIZZBuzz");
				} else if (i % 3 == 0) {
					System.out.println("FIZZ");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}

			}
		}

	}
}
