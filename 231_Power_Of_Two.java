class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n==1)return true;
       if(n==0||n%2!=0)return false;
       if(n%2==0){
        return isPowerOfTwo(n/2);
       }
       return false;
    }
}
