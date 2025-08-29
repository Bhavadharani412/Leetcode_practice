class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0, s = 0;
        for(int i : nums){
           s = (i == 0) ? s+1 : 0;
           count += s; 
        }
        return count;
    }
}