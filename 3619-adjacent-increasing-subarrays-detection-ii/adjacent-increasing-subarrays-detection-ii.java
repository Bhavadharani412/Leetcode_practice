class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int ans = 0, inc = 1, prev = 0;
        for(int i = 1; i < nums.size();++i){
            if(nums.get(i) > nums.get(i-1)) ++inc;
            else {
                prev = inc;
                inc = 1;
            }
            ans = Math.max(Math.max(ans, inc/2),Math.min(prev, inc));
        }
        return ans;
    }
}