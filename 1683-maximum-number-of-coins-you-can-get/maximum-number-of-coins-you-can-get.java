class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res = 0, n = piles.length;
        for (int i = n / 3; i < n;res += piles[i], i += 2);
        return res;
    }
}