class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }
    public static int reverse(int n){
        int ne = 0;
        while(n!=0){
            ne = (ne*10)+n%10;
            n = n/10;
        }
        return ne;
    }
}