class Solution {
    public int largestPerimeter(int[] nums) {
        int perimeter = 0, max = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = n - 1; i >= 2;i--){
            if(nums[i-2] + nums[i-1] > nums[i])
                return nums[i] + nums[i-1] + nums[i-2];
        }
        return 0;
    }
}