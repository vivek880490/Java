import java.util.*;
public class matrix {
    int rows;
    int column;
    int [][]a;
    matrix(int rows, int column){
        this.rows = rows;
        this.column = column;
        a=new int[rows][column];
        
    }
    public int getrows(){
        return rows;
    }
    public int getcolumn(){
        return column;
    }
    public int getelement(int r,int c){
        return a[r][c];
    }
    public void setelement(int r, int c,int element){
        a[r][c]=element;
    }
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int element=sc.nextInt();
matrix m1=new matrix(a,b);
m1.setelement(a, b,element);
System.out.println(m1.getelement(2,3));

    }
}
