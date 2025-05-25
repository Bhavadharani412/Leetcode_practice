class Solution {
    public boolean detectCapitalUse(String word) {
        int caps = 0;
        int n = word.length();
        for(int i = 0;i < n; i++){
            if(Character.isUpperCase(word.charAt(i))) caps++;
        }
        if(caps == 0) return true;
        else if(caps == n) return true;
        else if(caps == 1 && Character.isUpperCase(word.charAt(0))) return true;
        else return false;
    }
}
