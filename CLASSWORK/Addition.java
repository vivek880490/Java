package ClassWork;
import java.util.Scanner;



public class Addition {
	
	double a, b, result;

	
	void add() {
		System.out.println("sum is: " + (a+b));
		
	}
	
	float add(int c, float d) {
		return (c+d);
	}
	
	void add(String a, String b) {
		System.out.println(a.concat(b));
	}
	
	
	public static class Test{
		int data;
	}
	
	
	Test add(Test ob1, Test ob2) {
		 
		 return ob1+ob2;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Addition obj1 = new Addition();
		obj1.add();
		System.out.println("Enter Float Value: ");
		float a = sc.nextFloat();
		System.out.println("Enter Integer Value: ");
		int b = sc.nextInt();
		System.out.println("sum is: " +  obj1.add(b, a));
		
		
		sc.nextLine();
		System.out.println("Enter String 1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter String 2: ");
		String s2 = sc.nextLine();
		obj1.add(s1, s2);
		
		
		
		

	}

}