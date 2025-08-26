class Solution {
    public boolean areNumbersAscending(String s) {
        int pre = 0, cur = 0;
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) >='0' && s.charAt(i) <= '9'){
                cur = s.charAt(i)-'0';
                while(i+1 < s.length() && s.charAt(i+1) >='0' && s.charAt(i+1) <= '9' ){
                    cur = (cur * 10) + (s.charAt(i+1) - '0');
                    i++;
                }
                if(cur <= pre){
                    return false;
                }
                pre = cur;
            }
        }
        return true;
    }
}