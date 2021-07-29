import java.util.*;
public class student {
    private String name;
    private int rollno;

    student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    String b=sc.nextLine();
    int a=sc.nextInt();
    student s1=new student(b,a);
    
    // s1.rollno=a;
    //  s1.name=b;
     
     System.out.println("Name:- "+s1.name+ ", rollno:- "+s1.rollno);
}
}
