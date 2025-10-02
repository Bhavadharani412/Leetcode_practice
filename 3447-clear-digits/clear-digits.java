class Solution {
    public String clearDigits(String s) {
       StringBuilder res = new StringBuilder(s); 
       for(int i = 0; i < res.length();i++){
        if(!(res.charAt(i) >= 'a' && res.charAt(i) <= 'z')){
            res.deleteCharAt(i).deleteCharAt(i-1);
            i = 0;
        }
       }
       return res.toString();
    }
}