package college;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("PLEASE CHOICE THE OPITION");
		System.out.println("1.RED");
		System.out.println("2.YELLOW");
		System.out.println("3.GREEN");
		System.out.println("ENTER THE OPITION IN NUMBER");

		int a = s.nextInt();
		switch (a) {
		case 1:
			System.out.println("STOP");
			break;
		case 2:
			System.out.println("GET REDY");
			break;
		case 3:
			System.out.println("GO");
			break;

		default:
			System.out.println("SIGNAL NOT WORKING");

		}

	}

}
