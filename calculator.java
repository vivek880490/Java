import java.util.Scanner;
public class calculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks Of Sub1");
        int sub1= sc.nextInt();
        //System.out.println(sc.hasNextInt());
        System.out.println("Enter Marks Of Sub2");
        int sub2= sc.nextInt();
        System.out.println("Enter Marks Of Sub3");
        int sub3= sc.nextInt();
        System.out.println("Enter Marks Of Sub4");
        int sub4= sc.nextInt();
        System.out.println("Enter Marks Of Sub5");
        int sub5= sc.nextInt();


        float p= (sub1+sub2+sub3+sub4+sub5);
        float per= p*0.2f;

        System.out.println("Your Percentage is");
        System.out.println(per);
        sc.close();
        
        
        

        

        



    }
}
