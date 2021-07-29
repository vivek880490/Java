/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sumofdigits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		   Scanner sc= new Scanner(System.in);
		   int t=sc.nextInt();
		   int temp=0;
		   int result=0;
		   int N= sc.nextInt();
		   for(int i=0;i<t;i++){
		        N= sc.nextInt();
		       
		   
		   
		   while(N!=0){
		      temp=N%10;
		      result=result+temp*temp;
		      N=N/10;
		   }
		   System.out.println(result);}
		}
		catch(Exception e){
		    
		}
	}
}
