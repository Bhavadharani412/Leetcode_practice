class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length;i++){
            String rev = new StringBuilder(str[i]).reverse().toString();
            result.append(rev);
            if (i < str.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}