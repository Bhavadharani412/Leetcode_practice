class Solution {
    public int smallestNumber(int n) {
        int ans = (int) (Math.log(n) / Math.log(2)) + 1;
        return (1 << ans) - 1;
    }
}