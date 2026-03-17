class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if(n == 1)return true;
        int first = word.charAt(0);
        boolean firstCaps = (first > 64 && first < 91) ? true : false;
        int sec = word.charAt(1);
        boolean secCaps = (sec > 64 && sec < 91) ? true : false;
        // boolean ans = true;
        for(int i = 1; i < n;i++){
            int x = word.charAt(i);
            if(!firstCaps){
                if(x > 64 && x < 91) {
                    return false;
                }
                else continue;
            }
            else{
                if (i == 1) continue;
                if(secCaps){
                    if(x > 96 && x < 123) return false;
                    else continue;
                }
                else{
                    if(x > 64 && x < 91) return false;
                }
            }
        }
        return true;
    }
}