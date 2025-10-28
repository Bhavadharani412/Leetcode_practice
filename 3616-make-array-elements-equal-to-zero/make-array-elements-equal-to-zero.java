class Solution {
    public int countValidSelections(int[] nums) {
        int count = 0, sum = 0, half = 0;
        for(int i : nums) sum += i;
        for(int i = 0; i < nums.length;i++){
            half += nums[i];
            if(nums[i] == 0){
                if(2 * half == sum) count += 2;
                else if(Math.abs(sum - 2 * half) == 1)
                count++;
            }
        }
        return count;
    }
}