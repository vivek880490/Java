import java.util.HashMap;
import java.util.*;

/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] arr) {
        int ans=0;
       HashSet<Integer> al = new HashSet<Integer>();
       for(int i=0;i<arr.length;i++) {
           al.add(arr[i]);


       }
       for(int i=0;i<arr.length;i++) {
           if(!(al.contains(arr[i]-1))){
               int j=arr[i];
               while(al.contains(j)){
                   j++;
               }
               if(ans<j-arr[i]){
                   ans=j-arr[i];
               }
           }
       }
       return ans;
       
      
    }
}
// @lc code=end

