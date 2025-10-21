class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        int maxi = 0,ans = 0, prev = 0,cur = 0;
        for (int num : nums) maxi = Math.max(maxi, num);
        int[] pre = new int[maxi + 1];
        for (int num : nums) pre[num]++;
        for (int i = 0; i < Math.min(k, pre.length); i++) {
            cur += pre[i];
        }
        for (int num = 0; num <= maxi; num++) {
            cur -= pre[num];
            if (num + k <= maxi)
                cur += pre[num + k];
            if (num > 0)
                prev += pre[num - 1];
            if (num > k + 1)
                prev -= pre[num - k - 1];
            ans = Math.max(ans, pre[num] + Math.min(numOperations, prev + cur));
        }
        return ans;
    }
}