class Solution {
    public int longestString(int x, int y, int z) {
        int min = Math.min(x,y);
        return (x != y) ? (2*min + (min + 1)*2 + 2*z) : (4*x + 2*z);
    }
}