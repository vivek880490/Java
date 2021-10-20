
import java.util.*;
import java.lang.*;
import java.io.*;

public class C_Painting_the_Fence
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader sc =new FastReader();
        int a=sc.nextInt();
        long arr[]=sc.readArrayLong(a);
        Arrays.sort(arr);
        long ans=1;
        long M = 1000000007;
        for(int i=0; i<arr.length; i++){
            ans=ans*Math.max(arr[i]-i,0);
            ans=ans%M;

        }
        System.out.println(ans);

    }
	
	
	
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        
        float nextFloat()
        {
            return Float.parseFloat(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        
        int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		
		long[] readArrayLong(int n) {
			long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextLong();
			return a;
		}
		
    }
    
}