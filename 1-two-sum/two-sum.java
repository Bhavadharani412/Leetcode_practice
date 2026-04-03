class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}