class Solution {
    public void sortColors(int[] nums) {
        int z = 0, i = 0, t = nums.length - 1;
        while(i <= t){
            if(nums[i] == 0)
            {
                swap(nums, i, z);
                z++;
                i++;
            }
            else if(nums[i] == 1) i++;
            else
            {
                swap(nums, i, t);
                t--;
            }
        }
    }
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}