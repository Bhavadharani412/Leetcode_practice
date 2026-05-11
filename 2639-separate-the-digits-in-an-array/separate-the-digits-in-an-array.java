/*
get powers of nums, declare size accordingly
last index to first index;
add from last index
*/
class Solution {
    public int[] separateDigits(int[] nums) {
        int size = 0;
        int len = nums.length;
        for(int i : nums){
            size += Math.log10(i) + 1;
        }
        int[] output = new int[size];
        int ind = size - 1;
        for(int i = len - 1; i >= 0; i--){
            while(nums[i] != 0){
                output[ind--] =  nums[i] % 10;
                nums[i] /= 10;
            }
        }
        return output;
    }
}