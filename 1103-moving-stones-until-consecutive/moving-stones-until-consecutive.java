class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int max = Math.max(c,Math.max(a,b)), min = Math.min(c,Math.min(a,b));
        int max1 = max - min - 2;
        int min1 = Math.max(Math.min(3, Math.min(Math.abs(a - b), Math.min(Math.abs(b - c), Math.abs(a - c)))) - 1, 1);
        min1 = (max1 == 0) ? 0 : min1;
        return new int[] {min1, max1};
    }
}