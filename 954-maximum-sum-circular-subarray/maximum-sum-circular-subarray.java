class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int maxsum = nums[0], minsum  = nums[0], currmax = nums[0], currmin = nums[0], total = nums[0];
       for(int i = 1; i < nums.length; i++){
        currmax = Math.max(currmax + nums[i], nums[i]);
        maxsum = Math.max(maxsum, currmax);
        currmin = Math.min(currmin + nums[i], nums[i]);
        minsum = Math.min(minsum, currmin);
        total += nums[i];
       }
       int circular = total - minsum;
       if(circular == 0) return maxsum;
       return Math.max(maxsum, circular);
    }
}