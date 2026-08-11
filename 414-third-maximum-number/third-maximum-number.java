class Solution {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            if(nums[i] > firstMax)
            {
                thirdMax = secMax;
                secMax = firstMax;
                firstMax = nums[i];
            }
            else if(nums[i] < firstMax && nums[i] > secMax)
            {
                thirdMax = secMax;
                secMax = nums[i];
            }
            else if(nums[i] < secMax && nums[i] > thirdMax)
            {
                thirdMax = nums[i];
            }
        }
        return (thirdMax != Long.MIN_VALUE) ? (int) thirdMax : (int) firstMax;
    }
}