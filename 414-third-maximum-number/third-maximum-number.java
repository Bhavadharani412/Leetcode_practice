class Solution {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > firstMax){
                firstMax = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > secMax && nums[i] != firstMax){
                secMax = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > thirdMax && nums[i] != firstMax && nums[i] != secMax){
                thirdMax = nums[i];
            }
        }
        if(thirdMax == Long.MIN_VALUE){
            return (int) firstMax;
        }
        return (int) thirdMax;
    }
}