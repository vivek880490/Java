import java.util.*;
public class rockpaper {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(3);
       // int paperc = random.nextInt(3);
        //int scissorc = random.nextInt(3);
        Scanner scanner = new Scanner(System.in);
        //int rock=0;
        //int paper=1;
        //int sc=2;

        int rocku  =scanner.nextInt();

        //int paperu=scanner.nextInt();
        //int scissoru=scanner.nextInt();
        if(rocku<x){
            System.out.println("Computer Wins");
        }
        else{
            System.out.println("You Wins");
        }
        //else if(<rocku){
            //System.out.println("You Wins");
        //}
        //else if(rockc<rocku){
        //    System.out.println("You Wins");
        //}
        //else if(rockc<rocku){
            //System.out.println("You Wins");
       // }
        //else if(rockc<rocku){
        //    System.out.println("You Wins");
        //}
        System.out.println(x);
        
    }
}
