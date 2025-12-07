class Solution {
    public int countOdds(int low, int high) {
        int nums = high - low + 1;
        return (low % 2 != 0 && high % 2 != 0) ? nums/2 + 1 : nums/2;
    }
}