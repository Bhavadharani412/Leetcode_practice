class Solution {
    public int subsetXORSum(int[] nums) {
      int or=0;
      for(int i = 0; i<nums.length; i++ ){
        or |= nums[i];
      }
      int result = or * (int)Math.pow(2, nums.length-1);
      return result;
    }
}
