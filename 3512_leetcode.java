class Solution {
    public int minOperations(int[] nums, int k) {
        int total = 0;
        for (int num : nums){
            total += num;
        }
        return total % k;
    }
}
