class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) 
    {
        int sum=0,d,num=x;
        while(x!=0)
        {
            d=x%10;
            sum+=d;
            x=x/10;
        }
        if(num%sum==0)
        {
            return sum;
        }
        return -1;
    }
}
