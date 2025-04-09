class Solution {
    public char findTheDifference(String s, String t) {
        int ascii1 = 0, ascii2 = 0;
        for(int i=0; i<s.length();i++){
            ascii1 += (int) s.charAt(i);
        }
        for(int i=0; i<t.length();i++){
            ascii2 += (int) t.charAt(i);
        }
        int diff = ascii2 - ascii1;
        char a = (char)diff;
        return a;
    }
}
