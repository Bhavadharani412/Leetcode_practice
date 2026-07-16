/*
*Traverse the array once, using each value arr[i] to compute an index idx = abs(arr[i]) - 1.
Check the value at arr[idx]:
=> If it is positive, mark it as visited by setting arr[idx] = -arr[idx].
=> If it is already negative, it means arr[i] has been seen before, so it's a duplicate.
Add such duplicate values to the result list
*/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for(int ind = 0; ind < n ; ind++)
        {
            int val = Math.abs(nums[ind]) - 1;
            if(nums[val]< 0) res.add(Math.abs(nums[ind]));
            else nums[val] = -nums[val];
        }
        return res;
    }
}