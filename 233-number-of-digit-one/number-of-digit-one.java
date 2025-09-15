class Solution {
    public int countDigitOne(int n) {
        if(n < 1) return 0;
        int count = 0;
        if(n < 10) return 1;
        long fact = 1;
        while(fact <= n){
            long low = n % fact;
            long curr = (n / fact) % 10;
            long high = n / (fact * 10);
            count += (curr == 0) ? high*fact :(curr == 1)?high*fact+low+1 :(high + 1) * fact;
            fact *= 10;
        }
        return count;
    }
}