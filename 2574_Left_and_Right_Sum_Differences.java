class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        if(n==1) {
            result[0] = 0;
            return result;
        }
        int[]  leftsum = new int[n];
        leftsum[0] = 0;
        int[] rightsum = new int[n];
        rightsum[n - 1] = 0;
        for(int i = 1;i<n;i++ ){
            leftsum[i] = leftsum[i-1]+nums[i-1];
        }
        for(int i = n - 2;i>=0;i--){
            rightsum[i] = rightsum[i+1]+nums[i+1];
        }
        for(int i = 0;i<n;i++){
            result[i] = Math.abs(rightsum[i]-leftsum[i]);
        }
        return result;
    }
}
