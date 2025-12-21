class Solution {
    public int titleToNumber(String str) {
        int res = 0,d = 0;
        char c;
        for(int i = 0;i<str.length();d=str.charAt(i)-'A'+ 1,res = res *26+d,i++);
        return res;
    }
}