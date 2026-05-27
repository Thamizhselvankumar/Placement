package college;
import java.util.Scanner;
public class Count {
	public static void main(String[] args) {
		int n;
		int count=1;
		int rem=0;
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			rem=n%10;
			count++;
			n=n/10;
		}
		
		
		System.out.println(count);
		
	}

}
