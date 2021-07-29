import java.util.*;
class Codechef{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int evencount=0;
        int oddcount=0;
      int n=sc.nextInt();
      int []a=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
       for(int j=0;j<n;j++){
           if(a[j]%2==0){
               evencount++;
           }
           else{
               oddcount++;
           }
       }
       if(evencount>oddcount){
           System.out.println("READY FOR BATTLE");
       }
       else{
           System.out.println("NOT READY");
       }
    }
}