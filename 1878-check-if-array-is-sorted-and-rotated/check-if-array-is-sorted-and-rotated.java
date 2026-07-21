class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int min = nums[0]; 
        // minimum
        for (int x : nums)
            min = Math.min(min, x);
        
        for (int pivot = 0; pivot < n; pivot++) {
            if (nums[pivot] != min)
                continue;
            boolean ok = true;
            // right half
            for (int i = pivot; i < n - 1 && ok; i++) {
                if (nums[i] > nums[i + 1])
                    ok = false;
            }

            // left half
            for (int i = 0; i < pivot - 1 && ok; i++) {
                if (nums[i] > nums[i + 1])
                    ok = false;
            }

            // connection
            if (ok && pivot > 0 && nums[n - 1] > nums[0])
                ok = false;

            if (ok)
                return true;
        }
        return false;
    }
}