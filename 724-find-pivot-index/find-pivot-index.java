class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = nums[0];
        for(int i = 1; i < n; i++)
        {
            pre[i] = nums[i] + pre[i-1];
        }
        int totalSum = pre[n-1];
        int leftSum = 0;
        for(int i = 0; i < n; i++)
        {
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}