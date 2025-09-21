class Solution {
    public boolean xorGame(int[] nums) {
        int xor = 0;
        for(int i : nums){
            xor ^= i;
        }
        boolean a = (xor == 0), b = nums.length % 2 == 0;
        return a || b;
    }
}