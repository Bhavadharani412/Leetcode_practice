class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int zc = 0, prod = 1;
        int[] ans = new int[n];
        for(int i : nums)
        {
            if(i != 0) prod *= i;
            else zc++;
        }
        if(zc > 1) return ans;
        for(int i = 0; i < n; i++)
        {
            if(zc > 0) ans[i] = (nums[i] == 0) ? prod : 0;
            else ans[i] = prod / nums[i];
        }
        return ans;
    }
}