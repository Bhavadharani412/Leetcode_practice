class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int cnt_0 = 0;
        int cnt_1 = 0;
        int cnt_2 = 0;
        for(int i : nums){
            if(i == 0) cnt_0++;
            else if(i == 1) cnt_1++;
            else cnt_2++;
        }
        for(int i = 0; i < n;i++){
            if(cnt_0 != 0){
                nums[i] = 0;
                cnt_0--;
            }
            else if((cnt_0 == 0) && cnt_1 != 0){
                nums[i] = 1;
                cnt_1--;
            }
            else{
                nums[i] = 2;
                cnt_2--;
            }
        }
    }
}