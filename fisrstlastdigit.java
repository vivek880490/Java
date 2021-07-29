import java.util.*;
class fisrstlastdigit{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=0,n=0,temp=0;
        while(s.hasNextInt()){
            t=s.nextInt();
            for(int i=0;i<t;i++){
                n=s.nextInt();
                int sum=0;
            
            while(n!=0){
                temp=n%10;
               // f=f+temp*temp;
                n=n/10;
                sum=sum+temp;
                
            }
            System.out.println(sum);
            }
            System.exit(0);
        }
    }
}