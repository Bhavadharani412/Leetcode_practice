class Solution {
    public int countHillValley(int[] nums) {
        int count = 0, j = 0, n = nums.length;
        for (int i = 1; i < n - 1; i++) {
            if ((nums[j] < nums[i] && nums[i] > nums[i + 1]) ||
                (nums[j] > nums[i] && nums[i] < nums[i + 1])) {
                count++;
                j = i;
            }
        }
        return count;
    }
}
