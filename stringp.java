import java.util.*;
public class stringp {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      String s= sc.next();
      System.out.println(s.toLowerCase());
      //Replace
      String name="To Lower  Case";
      name=name.replace(" ","_");
      System.out.println(name);
      System.out.println(s.contains("o"));
      System.out.println(name.indexOf("o"));
      sc.close();
    }
}
