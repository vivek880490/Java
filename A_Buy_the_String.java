
import java.util.*;
import java.lang.*;
import java.io.*;

public class A_Buy_the_String
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        boolean ans= false;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        if(isPossible(a,n)==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
           
        
        
        
        
	    
	}
	
    static boolean isPossible(int a[], int n)
{
    
    int cur = a[0];
 
   
    cur--;
 
    
    for (int i = 1; i < n; i++)
    {
 
       
        int nxt = a[i];
 

        if (nxt > cur)
            nxt--;
 
       
        else if (nxt < cur)
            return false;
 
        cur = nxt;
    }
 
   
    return true;
}
}
	
	