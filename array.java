public class array {
    public static void main(String args[]) {
      int n2=520;
      long rem2 =0;
      while(n2!=0){
            rem2 = n2 % 10;
            System.out.println(rem2);
            n2 /= 10;
        }
    }
}