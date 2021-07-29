/**
 * string
 */
public class string {

    public static void main(String[] args) {
        String s="hellogikaiseho";
        int l=s.length();
        int k=2;
        for(int i=0; i<l-k; i++){
            
            System.out.print(s.substring(i,i+k)+" ");
        }

    }
}