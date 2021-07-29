
import java.util.*;
 class Circle {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
    double radius;
    String color;
   
   
   // Constructors (overloaded)
   /** Constructs a Circle instance  */
    Circle(int x,String y) {  
     this.radius=x;
     this.color=y;
   }
   
   /** Returns the radius */
   
   public double getRadius() {
     return radius; 
   }
   
   /** Returns the area of this Circle instance */
   public double getArea() {
      return radius*radius*Math.PI;
   }
   public String getColor() {
    return color;
}


   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    sc.nextLine();
    String c=sc.nextLine();
      
      Circle c1 = new Circle(r,c);
      // Invoke public methods on instance c1, via dot operator.
      System.out.println("The circle has radius of " 
         + c1.getRadius() +" color is" + c1.getColor()+ " and area of " + c1.getArea());
     
     
      Circle c2 = new Circle(r,c);
      // Invoke public methods on instance c2, via dot operator.
      System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea());
      
   }

}