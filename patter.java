import java.util.*;
public class patter {
   
        
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=i;j<=a;j++){
                System.out.print("*");
            }
            System.out.print("\n");
            
        }
    }
}
