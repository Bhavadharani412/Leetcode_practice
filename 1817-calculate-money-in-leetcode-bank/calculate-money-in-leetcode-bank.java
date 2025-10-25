class Solution {
    public int totalMoney(int n) {
        if(n < 7) return (n*(n+1)) / 2;
        int div = n / 7, mod = n % 7;
        int fs = (div * (2 * 28 + (div - 1) * 7)) / 2;
        int ans = fs + ((mod * (mod + 1))/ 2) + mod * div;
        return ans;
    }
}