class Solution {
    public int[] moveZeroes(int[] nums) {
        int z = 0, nz = 0;
        int len = nums.length;
        while(nz < len)
        {
            if(nums[nz] == 0) nz++;
            else{
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                nz++;
                z++;
            }
        }
        return nums; 
    }
}