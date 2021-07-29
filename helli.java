
import java.util.Scanner;
public class helli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a= sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        int sum =a+b;
        System.out.println("The sum is");
        System.out.println(sum);
        sc.close();
    }
    
}

