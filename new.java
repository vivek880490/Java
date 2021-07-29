/**
 * new
 */
import java.util.*;
public class new {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            String s =sc.nextLine();
            System.out.println(i+s);
        }
    }
}