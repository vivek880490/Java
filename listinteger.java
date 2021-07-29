import java.util.*;
public class listinteger {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        int l=list.size();
        System.out.println("ArrayList : " + list + l);
        for (int i=l-1;i<=0;i--){
            list.add(i);

            
        }
        System.out.println(list);

    }
    
}
