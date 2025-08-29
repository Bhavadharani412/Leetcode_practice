class Solution {
    public long flowerGame(int n, int m) {
        long even_n = n / 2, odd_n = n - even_n;
        long even_m = m / 2, odd_m = m - even_m;
        return (even_n * odd_m)+ (odd_n * even_m);
    }
}