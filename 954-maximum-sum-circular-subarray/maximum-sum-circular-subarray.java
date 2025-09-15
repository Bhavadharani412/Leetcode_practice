class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0, currentMinSum= 0, currentMaxSum= 0, maxSum = Integer.MIN_VALUE, minSum= Integer.MAX_VALUE;
        for (int n: nums){
            totalSum += n;
            currentMaxSum = Math.max(n, currentMaxSum+n);
            maxSum =  Math.max(currentMaxSum, maxSum);
            currentMinSum= Math.min(n, currentMinSum+n);
            minSum =  Math.min(currentMinSum, minSum);
        }
        if (maxSum < 0) return maxSum;
        return Math.max(maxSum, totalSum - minSum); 
    }
}