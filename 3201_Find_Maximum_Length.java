class Solution {
    public int maximumLength(int[] nums) {
        int oddCount = 0, evenCount = 0, count = 0;
        boolean bool = nums[0]%2 == 1;
        for(int num:nums){
            if(num%2==1){
                if(bool){
                    bool = !bool;
                    count++;
                }
                oddCount++;
            }
            else{
                if(!bool){
                    bool = !bool;
                    count++;
                }
                evenCount++;
            }
        }
        return Math.max(count,Math.max(oddCount,evenCount));
    }
}
