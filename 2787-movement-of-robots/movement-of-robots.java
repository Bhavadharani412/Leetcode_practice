import java.util.*;

class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        int n = nums.length;
        long mod = 1_000_000_007;
        long[] pos = new long[n];
        
        // Step 1: Compute final positions
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                pos[i] = (long) nums[i] + d;
            } else {
                pos[i] = (long) nums[i] - d;
            }
        }

        // Step 2: Sort final positions
        Arrays.sort(pos);

        // Step 3: Use prefix sum to calculate total distances
        long sum = 0;
        long prefix = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum + (pos[i] * i - prefix)) % mod;
            prefix = (prefix + pos[i]) % mod;
        }

        return (int) sum;
    }
}