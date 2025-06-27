class Solution {
    public int countBalls(int lowLimit, int highLimit) {
       int result=0;
        int[] count=new int[46];
        for(int j=lowLimit ; j<=highLimit ; j++){
            int x=0;
            int i=j;
            while(i>0){
                x+=i%10;
                i/=10;
            }
            count[x]++;
            result=Math.max(count[x],result);
        }
        return result; 
    }
}
