class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0;
        int csum = 0;
        int left = 1;
        int right = k;
        for(int i = 0;i < k;i++){
            csum += nums[i];
        }
        max = csum;
        while(right < nums.length){
            csum = csum - nums[left - 1] + nums[right];
            max = Math.max(max, csum);
            left++;
            right++;
        }
        return max/k;
    }
}