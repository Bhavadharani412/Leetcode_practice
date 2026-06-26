class Solution {
    public int maximum69Number (int num) {
        int pow = power(num);
        int res = 0;
        boolean flag = false;
        while(pow > 0)
        {
            int dig = (int) (num / pow);
            //System.out.print(dig);
            if(dig == 6 && flag == false)
            {
                res = res * 10 + 9;
                flag = true;
            }
            else 
                res = res * 10 + dig;
            num %= pow;
            pow /= 10;
        }
        return res; 
    }
    public int power(int num){
        int power = 1;
        while(num / power > 9)
        {
            power *= 10;
        }
        return power;
    }
}