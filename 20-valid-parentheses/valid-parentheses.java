class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        for(char k : arr){
            if((k & 3)==1){
                if(i == 0 || (char)( k - arr[--i])>2) return false;
            }
            else arr[i++] = k;
        }
        return i == 0;
    }
}