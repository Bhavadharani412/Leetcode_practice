class Solution {
    public int countConsistent(int[] nums) {
        int res = 0, len = nums.length;
        for(int i = 0; i < len; i++)
        {
            int min = Integer.MAX_VALUE, and = nums[i];
            for(int j = i; j < len; j++)
            {
                min = Math.min(nums[j], min);
                and &= nums[j];
                if(and == min) res++;
            }
        }
        return res;
    }
}