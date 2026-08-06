class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            if (digit_prod(n) % t == 0)
                return n;
            n++;
        }
    }
    public int digit_prod(int n)
    {
        int prod = 1;
        while(n > 0)
        {
            prod *= (n % 10);
            n /= 10;
        }
        return prod;
    }
}