

import java.util.*;
import java.lang.*;
import java.io.*;


public class B_GCD_Length
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t;
		t=sc.nextInt();
		
		while(t-->0)
		{
		    int a,b,c;
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    int z=1;
		    while(digit(z)<c)
		    {
		        z=z*2;
		    }
		    int x=z;
		    int y=z;
		    while(digit(x)<a)
		    {
		        x=x*3;
		    }
		    while(digit(y)<b)
		    {
		        y=y*5;
		    }
		    System.out.print(x+" "+y);
		    System.out.println();
		    
		}
		
	}
	static int digit(int x)
	{
	    int count=0;
	    while(x>0)
	    {
	        count++;
	        x=x/10;
	    }
	    return count;
	}
}
