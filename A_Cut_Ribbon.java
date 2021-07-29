/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Cut_Ribbon
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t-->0){
			String s=scn.next();
			char open=s.charAt(0);
			char close=s.charAt(s.length()-1);
			if(open==close){
				System.out.println("NO");
				continue;
			}
			
			String test1="";
			String test2="";
			for(int i=0;i<s.length();i++){
				char ch=s.charAt(i);
				if(ch==open){
					test1+="(";
					test2+="(";
				}else if(ch==close){
					test1+=")";
					test2+=")";
				}else{
					test1+=")";
					test2+="(";
				}
			}
            System.out.println(test1+" "+test2)
			boolean ans=getAns(test1) || getAns(test2);
			if(ans){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
	
	
}