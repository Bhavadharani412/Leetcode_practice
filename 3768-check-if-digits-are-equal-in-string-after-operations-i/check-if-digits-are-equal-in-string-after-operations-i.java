class Solution {
    public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            String new_s = "";
            for (int i = 0; i < s.length() - 1; i++) {
            new_s+=(s.charAt(i)-'0'+s.charAt(i+1)-'0')%10;
            }
        s = new_s;
        }
        return s.charAt(0) == s.charAt(1);
    }
}