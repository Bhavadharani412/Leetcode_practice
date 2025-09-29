class Solution {
    public int findFinalValue(int[] nums, int original) {
        int ans = original;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == original){
                ans *= 2;
                original = ans;
            }
        }
        return ans;
    }
}