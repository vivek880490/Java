import java.io.*;
import java.util.*;
public class A_And_Then_There_Were_K{

    
    public static void main(String args[]){
        FastReader sc=new FastReader();
        int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int x=1;
                while(true){
                    if(x*2>n){
                        System.out.println(x-1);
                        break;
                    }
                    x=x*2;

                }

            



            
            }
    
        
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
        // This code snippet is a part of the FastReader class
// as illsutrated above



    // The try block runs when both input and output files
    // are present in the specified directory.
    try {
  
      // We modify the input stream to take input
      //from the  input.txt file
      br = new BufferedReader(new FileReader("input.txt"));
  
      // We modify the output stream to print the output
      // in the output.txt file
      PrintStream out = new
      PrintStream(new FileOutputStream("output.txt"));
  
      System.setOut(out);
    }
  
    // In case the input or the output file is not found,
    // a FileNotFoundException is thrown and we enter the
    // catch block.
  
    // Catch block to handle th exception
    catch (Exception e) {
  
      // Since an input file is not present, we take input
      // from the usual system input stream.
      br = new BufferedReader(
        new InputStreamReader(System.in));
    }
  
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
    static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
    
}

    