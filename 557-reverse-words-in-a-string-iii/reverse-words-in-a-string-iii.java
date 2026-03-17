class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        int n = str.length;
        String res = "";
        for(int iter = 0; iter < n;iter++){
            res += strReverse(str[iter]);
        }
        return res.trim();
    }
    private static String strReverse(String str){
        int len = str.length();
        String ans = "";
        for(int i = len - 1; i >= 0; i--){
            ans += str.charAt(i);
        }
        ans +=" ";
        return ans;
    }
}