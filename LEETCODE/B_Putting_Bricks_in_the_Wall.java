
import java.util.*;
import java.lang.*;
import java.io.*;

public class B_Putting_Bricks_in_the_Wall
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader sc =new FastReader();
		
	    int t=sc.nextInt();
	    
	    while(t-->0)
	    {
         
            int n=sc.nextInt();
            String arr[]=new String[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.next();
            }
            int a=arr[0].charAt(1);
            int b=arr[1].charAt(0);

            int c=arr[n-1].charAt(n-2);
            int d=arr[n-2].charAt(n-1);
            if(a==b && c!=d || c==d && a!=b){
                System.out.println(1);
                System.out.println(1+" "+2);
            }
            else if(a==b && b==c && c==a){
                System.out.println(2);
                System.out.println(1+" "+2);
                System.out.println(2+" "+1);
            }
            else if(a==b && c==d){
                System.out.println(0);
            }
            
           
         
      

        
          
	    }
	    
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
    
    public static int[] radixSort2(int[] a)
	{
		int n = a.length;
		int[] c0 = new int[0x101];
		int[] c1 = new int[0x101];
		int[] c2 = new int[0x101];
		int[] c3 = new int[0x101];
		for(int v : a) {
			c0[(v&0xff)+1]++;
			c1[(v>>>8&0xff)+1]++;
			c2[(v>>>16&0xff)+1]++;
			c3[(v>>>24^0x80)+1]++;
		}
		for(int i = 0;i < 0xff;i++) {
			c0[i+1] += c0[i];
			c1[i+1] += c1[i];
			c2[i+1] += c2[i];
			c3[i+1] += c3[i];
		}
		int[] t = new int[n];
		for(int v : a)t[c0[v&0xff]++] = v;
		for(int v : t)a[c1[v>>>8&0xff]++] = v;
		for(int v : a)t[c2[v>>>16&0xff]++] = v;
		for(int v : t)a[c3[v>>>24^0x80]++] = v;
		return a;
	}
    
    static boolean isPalindrome(String str)
    {
 
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
    
    static boolean palindrome_array(int arr[], int n)
    {
        // Initialise flag to zero.
        int flag = 0;
 
        // Loop till array size n/2.
        for (int i = 0; i <= n / 2 && n != 0; i++) {
 
            // Check if first and last element are different
            // Then set flag to 1.
            if (arr[i] != arr[n - i - 1]) {
                flag = 1;
                break;
            }
        }
 
        // If flag is set then print Not Palindrome
        // else print Palindrome.
        if (flag == 1)
            return false;
        else
            return true;
    }
    
	static boolean allElementsEqual(int[] arr,int n)
	{
	    int z=0;
	        for(int i=0;i<n-1;i++)
		    {
		        if(arr[i]==arr[i+1])
		        {
		            z++;
		        }
		    }
		    if(z==n-1)
		    {
		        return true;
		    }
		    else
		    {
		        return false;
		    }
		    
	}
	
	static boolean allElementsDistinct(int[] arr,int n)
	{
	    int z=0;
	        for(int i=0;i<n-1;i++)
		    {
		        if(arr[i]!=arr[i+1])
		        {
		            z++;
		        }
		    }
		    if(z==n-1)
		    {
		        return true;
		    }
		    else
		    {
		        return false;
		    }
		    
		    
	}
	
	public static void reverse(int[] array)
    {
  
        // Length of the array
        int n = array.length;
  
        // Swaping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {
  
            // Storing the first half elements temporarily
            int temp = array[i];
  
            // Assigning the first half to the last half
            array[i] = array[n - i - 1];
  
            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
    }
    
    public static void reverse_Long(long[] array)
    {
  
        // Length of the array
        int n = array.length;
  
        // Swaping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {
  
            // Storing the first half elements temporarily
            long temp = array[i];
  
            // Assigning the first half to the last half
            array[i] = array[n - i - 1];
  
            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
    }
	
	static boolean isSorted(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
 
        return true;
    }
    
    static boolean isReverseSorted(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] < a[i + 1]) {
                return false;
            }
        }
 
        return true;
    }
    
    static int[] rearrangeEvenAndOdd(int arr[], int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
		    
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]%2==0)
		        {
		            list.add(arr[i]);
		        }
		    }
		    
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]%2!=0)
		        {
		            list.add(arr[i]);
		        }
		    }
		    int len = list.size();
		    int[] array = list.stream().mapToInt(i->i).toArray();
		    return array;
    }
    
    static long[] rearrangeEvenAndOddLong(long arr[], int n)
    {
        ArrayList<Long> list = new ArrayList<>();
		    
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]%2==0)
		        {
		            list.add(arr[i]);
		        }
		    }
		    
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]%2!=0)
		        {
		            list.add(arr[i]);
		        }
		    }
		    int len = list.size();
		    long[] array = list.stream().mapToLong(i->i).toArray();
		    return array;
    }
	
	
    
    static boolean isPrime(long n)
    {
 
        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;
 
        // Check if number is 2
        else if (n == 2)
            return true;
 
        // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;
 
        // If not, then just check the odds
        for (long i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    
    static int getSum(int n)
    {    
        int sum = 0;
          
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
      
    return sum;
    }
    
    static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
     
    static long gcdLong(long a, long b)
    {
        if (b == 0)
        return a;
      return gcdLong(b, a % b);
    }
    
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	
	static int countDigit(long n)
    {
        return (int)Math.floor(Math.log10(n) + 1);
    }
    static int sumFromString(String s){
        int sum = 0;
         for(int i = 0; i < s.length() ; i++){
             if( Character.isDigit(s.charAt(i)) ){
                 sum = sum + Character.getNumericValue(s.charAt(i));
             }
         }
         return sum;
     }
     static int []  freqCounter(int arr[]){
     int [] fr = new int [arr.length];  
     int [] fi=new int [arr.length];
     int visited = -1;  
     for(int i = 0; i < arr.length; i++){  
         int count = 1;  
         for(int j = i+1; j < arr.length; j++){  
             if(arr[i] == arr[j]){  
                 count++;  
                 //To avoid counting same element again  
                 fr[j] = visited;  
             }  
         }  
         if(fr[i] != visited)  
             fr[i] = count;  
     }  
     for(int i = 0; i < fr.length; i++){  
        if(fr[i] != visited) 
        fi[i]=fr[i];  
             
    } 
    return fi;    
    }
	
}