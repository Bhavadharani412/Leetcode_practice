class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0], max = nums[0];
        for(int i : nums){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return gcd(max, min);
    }
    public int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b, Math.abs(a % b));
    }
}