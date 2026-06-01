package day4;

import java.util.Arrays;

public class Strrrr {
    public static void main(String[] args) {
		
    	String a="heart";
    	String b="earth";
    	 char []g=a.toCharArray();
    	 char[] n=b.toCharArray();
    	Arrays.sort(g);
    	Arrays.sort(n);
    	System.out.println(g);
    	System.out.println(n);
    	
    	if (g.length!=n.length) 
    	
    	{
    		System.out.println("true");
    	}
    	for(int i=0;i<=g.length;i++) {
    		if(g!=n)
    		{
    			System.out.println("false");
    		}
    		
    			
    		}
    	}
}
