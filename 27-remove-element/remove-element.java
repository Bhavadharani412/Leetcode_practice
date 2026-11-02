class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length, a = 0 , b = n - 1;
        while(a <= b)
        {
            if(nums[a] == val)
            {
                nums[a] = nums[b];
                b--;
            }
            else a++;
        }
        return a;
    }
}