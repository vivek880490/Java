import java.util.*;
public class fibonaachi {
    public static int fibonaachj(int b){
        if(b<=1){
            return 1;
        }
       return (fibonaachj(b-2)+fibonaachj(b-1));
       

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int s=fibonaachj(a);
        System.out.println(s);

    }
    
}
