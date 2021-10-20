/*
 * @lc app=leetcode id=665 lang=java
 *
 * [665] Non-decreasing Array
 */

// @lc code=start
class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;                                                                    //the number of changes
       for(int i=1;i<nums.length;i++){
           if(nums[i]<nums[i-1]){
               if(i==1 || nums[i-2]<=nums[i]){
                   nums[i-1]=nums[i]; //green down
                   count++;
               }
               else{
                   nums[i]=nums[i-1]; //blue up
                   count++;
               }
           }

       }
       return count<=1;
    }
}

// @lc code=end

