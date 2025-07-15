class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean vowel = false;
        boolean con = false;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == '@' || ch == '#' || ch == '$') return false;
            if ("aeiouAEIOU".indexOf(ch) != -1) 
                vowel = true;
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A'&& ch <= 'Z')) 
                con = true;
        }
        return con && vowel;
    }
}   
