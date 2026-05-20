class Solution {
    public int calculate(String s) {
        if (s == null || s.isEmpty()) return 0;
        int len = s.length(), currNum = 0, lstNum = 0, res = 0;
        char sym = '+';
        for(int i = 0; i < len; i++)
        {
            char curr = s.charAt(i);
            if(Character.isDigit(curr) == true)
            {
                currNum = (currNum * 10) + (curr - '0');
            }
            if(Character.isDigit(curr) == false && Character.isWhitespace(curr) == false || i == len -1)
            {
                if(sym == '+')
                {
                    res += lstNum;
                    lstNum = currNum;
                }
                else if(sym == '-')
                {
                    res += lstNum;
                    lstNum = -currNum;
                }
                else if(sym == '*')
                {
                    lstNum = lstNum * currNum;
                }
                else if(sym == '/')
                {
                    lstNum = lstNum / currNum;
                }
                sym = curr;
                currNum = 0;
            }
        }
        res += lstNum;
        return res;
    }
}