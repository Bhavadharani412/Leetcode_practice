class Solution {
    public int majorityElement(int[] nums) {
        int cand = nums[0];
        int cnt = 1;
        int n = nums.length;
        for(int i = 1; i < n; i++)
        {
            if(cand == nums[i]) cnt++;
            else cnt--;
            if(cnt == 0)
            {
                cand = nums[i];
                cnt = 1;
            }
        }
        return cand;
    }
}