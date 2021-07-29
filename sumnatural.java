import java.util.*;
public class sumnatural {
    
        
    public static int sum(int n){
        int sum1=0;
        if(n==1){
            return 1;
        }
        return(n+sum(n-1)); 
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int s=sum(a);
        System.out.println(s);
        
        
    }
}
