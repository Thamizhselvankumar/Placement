package day3;

import java.util.Scanner;

public class Arrinput
{public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sum=0;
	int[] arr= new int[n];
	for (int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	
	}
	for (int i=0;i<n;i++)
	{
		if(arr[i]%2==0)
		{
			 sum+=arr[i];
		
		  
		}
	}System.out.print( sum);
	
}

}
