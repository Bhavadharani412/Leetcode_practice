class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        long  x = num1;
        for(int i = 1; i < 61; i++){
            x -= num2;
            if(i > x) return -1;
            if(i >= Long.bitCount(x)) return i;
        }
        return -1;
    }
}