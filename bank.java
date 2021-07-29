/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class bank
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    Scanner sc= new Scanner(System.in);
	    int t= sc.nextInt();
	    
	   
	    for(int i=0;i<=t;i++){
            int x= sc.nextInt();
            double ab=sc.nextDouble();
	      if(x>ab||x%5!=0){
	          System.out.println(ab);
              break;
	      }  
	      System.out.println(ab-(x+0.5));
          break;
	      
	    }
       
		
	}
}
