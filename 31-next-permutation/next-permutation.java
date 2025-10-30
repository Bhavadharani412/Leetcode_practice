class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, i = n - 2;
        while(i >= 0 && nums[i] >= nums[i+1])
        i--;
        if(i >= 0){
            int j = n - 1;
            while(nums[j] <= nums[i]) j--;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for(int l = i + 1, r = n - 1; l < r;l++,r--){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
    }
}