/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner sc= new Scanner(System.in);
		    int t=sc.nextInt();
		    int n=0;
			int f=1;
		    for(int i=0;i<t;i++){
		        n=sc.nextInt();
		        
		    
		    
		    if (n<=1){
		        System.out.println("1");
		        break;
		    }
		    for(int j=1;j<=n;j++){
		        f=f*j;
		        //System.out.println(f);
		    
		    }
		}
		    System.out.println(f);}
		    
		
		catch(Exception e){
		    
		}
	}
}
