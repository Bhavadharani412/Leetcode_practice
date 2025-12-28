class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int xor = 0, max = (1 << maximumBit) - 1, n = nums.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; xor^= nums[i++]);
        for(int i = 0; i < n;ans[i] = xor ^ max, xor ^= nums[n - 1- i],i++);
        return ans;
    }
}