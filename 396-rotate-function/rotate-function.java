class Solution {
    public int maxRotateFunction(int[] nums) {
        long sum = 0, f = 0, res;
        int ind = 0,size = nums.length;
        for(int num : nums ){
            sum += num;
            f += (long) ind * num;
            ind++;
        } 
        res = f;
        for(int k = 1; k < size; k++){
            f = f + sum - (long) size * nums[size - k];
            res = Math.max(res, f);
        }
        return (int) res;
    }
}