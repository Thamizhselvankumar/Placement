package day3;

import java.util.Arrays;

public class Find {
	public static void main(String[] args) {
		int[] n= {1,3,4,2,5,8,7};
	 Arrays.sort(n);
	System.out.println( n[1]);
		for(int i=0;i<n.length;i++)
		{
			if (n[i]!=i)
			{
				System.out.println(i);
			}
		}
		
		
		

	
	}
}
