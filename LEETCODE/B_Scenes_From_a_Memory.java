import java.util.Arrays;


public static String expandedForm(int num)
{

  String[] str = Integer.toString(num).split("");
  String result = "";

  for(int i = 0; i < str.length-1; i++) {
    if(Integer.valueOf(str[i]) > 0) {
      for(int j = i; j < str.length-1; j++) {
        str[i] += '0';
      }
    }
  }

  result = Arrays.toString(str);
  result = result.substring(1, result.length()-1).replace(",", " +");
  System.out.println(result);

  return result;
}