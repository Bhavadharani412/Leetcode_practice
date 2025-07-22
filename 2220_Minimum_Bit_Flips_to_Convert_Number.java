class Solution {
    public int minBitFlips(int start, int goal) {
        int d = start ^ goal; 
        int count = 0; 
        while (d != 0) {
            d &= (d - 1);
            count++;
        }
        return count;  
    }
}
