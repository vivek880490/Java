/**
 * binarysearch
 */

public class binarysearch {
    public static int search(int k,int ...a) { 
    int l=0;
    int h=(a.length-1);
    while(l<=h){
        int mid=(l+h)/2;
        if(a[mid]==k){
            return 1;
        }
        else if(k<a[mid]){
            h=mid-1;
        }
        else{
            l=mid+1;
        }
        
    }
    return -1;
}




        
    
public static void main(String[] args) {
    int []b ={1,2,3,4,5,6,7};
    int j=6;
    System.out.println(search(j,b));


}  
}