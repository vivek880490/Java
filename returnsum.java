import java.util.*;
public class returnsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sume=0;
        int sumo=0;
        for(int i = 1; i <=a;++i)
        {
            if(i%2!=0){
                sumo=sumo+i;
            }
           
        
        else if(i%2==0){
            sume=sume+i;
        }
    }
        System.out.println(sumo);
        System.out.println(sume);
        
            

        
    }
       
        

    }

