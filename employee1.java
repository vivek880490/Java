import java.util.*;
public class employee1 {
    private int  sal;
    private int workhour;
    // employee1(int sal,int workhour){
    //     this.sal = sal;
    //     this.workhour = workhour;
    // }
    public void getinfo(int sal,int workhour){
     this.sal = sal;
     this.workhour = workhour;
    }
    public int addsal(){
        if(sal<500){
            sal=sal+10;
            
        }
        return sal;
    }
        public int addwork(){
            if(workhour>6){
                sal=sal+5;
                
            }
            return sal;
        }
    
    
    
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
employee1 e1=new employee1();
e1.getinfo(a,b);
System.out.println("addsal "+ e1.addsal()+ " addwork "+ e1.addwork());


}
}
