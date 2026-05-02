class Solution {
    public int rotatedDigits(int n) 
    {
        int cnt;
        cnt = 0;
        boolean is_valid;
        boolean has_change;
        for(int iter = 1; iter <= n; iter++){
            int num = iter;
            is_valid = true;
            has_change = false;
            while( num > 0)
            {
                int dig = num % 10;
                if(dig == 3 || dig == 4 || dig == 7)
                {
                    is_valid = false;
                    break;
                }
                if(dig == 2 || dig == 5 || dig == 6 || dig == 9)
                {
                    has_change = true;
                }
                num /= 10;
            }
            if(is_valid == true && has_change == true) cnt++;
        }
        return cnt;
    }
}