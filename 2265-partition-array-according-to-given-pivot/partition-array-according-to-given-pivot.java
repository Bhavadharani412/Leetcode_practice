class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans=new int[nums.length];
        int same=0,start=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) ans[start++]=nums[i];
            else if(nums[i]==pivot)same++;
        }
        for(int i=0;i<same;i++) ans[start++]=pivot;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot) ans[start++]=nums[i];
        }
        return ans;
    }
}