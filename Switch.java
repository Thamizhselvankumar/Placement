package college;
import java.util.Scanner;
public class Switch 
{
  public static void main(String[] args) {
	Scanner b=new Scanner(System.in);
	  System.out.println("enter a number");
	  int day=b.nextInt()	;
		switch (day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesdayday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("not choose valid  ");

		}
	  
	  
	  
}
}
