class Solution {
    public int countBinarySubstrings(String s) {
        int result = 0;
        int prev = 0;
        int grplen = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                grplen++;
            } 
            else {
                prev = grplen;
                grplen = 1;
            }
            if (grplen <= prev) {
                result++;
            }
        }
        return result;
    }
}