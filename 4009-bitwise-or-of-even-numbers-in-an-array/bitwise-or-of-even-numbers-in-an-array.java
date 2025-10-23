class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int xor = 0;
        for(int i : nums){
            if(i % 2 == 0) xor |= i;
        }
        return xor;
    }
}