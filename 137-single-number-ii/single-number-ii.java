class Solution {
    public int singleNumber(int[] nums) {
       int a = 0,b = 0;
       for(int i : nums){
         a = (i ^ a) & (~b);
         b = (i ^ b) & (~a);
       } 
       return a;
    }
}