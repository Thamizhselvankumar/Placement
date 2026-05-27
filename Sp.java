package college;

public class Sp {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<=n;i++)
		{
			for (int j=0;j<=4;j++)
			{
			if(i+j==5||j==5)
			{
				System.out.print("*");
			}
			else {
				System.out.print("@");
			}
				
			}
			System.out.println("");
		}
		
		

	}

}
