import java.util.*;
 class rectangle {

    private int length;
    private int breadth;

    public void setDim(int length,int breadth) {
this.length=length;
this.breadth=breadth;
    }
    public int getArea(){
     return length*breadth;
    }



    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
    rectangle l1=new rectangle();
    l1.setDim(l,b);
    System.out.println("area "+l1.getArea());
    
}
}

