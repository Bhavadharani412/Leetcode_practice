class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] res = new int[nums.size()];
        for(int i = 0; i < nums.size();i++){
            int n = nums.get(i);
            res[i] = ((n&1) == 1) ? n & ~(((n+1)&~n)>>1) : -1;
        }
        return res;
    }
}