class Solution {
    public int smallestEqual(int[] nums) {
        int ans = -1;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == i % 10) return i;
        }
        return ans;
    }
}