class Solution {
    public int minOperations(int[] nums, int k) {
        int i = 0,total = 0;
        for(; i < nums.length; total += nums[i],i++);
        return total % k;
    }
}