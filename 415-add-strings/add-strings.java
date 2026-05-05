/*
1. access string convert to int 
access MSD --> LSD
2. add them convert back to 
156 / 317 testcases passed
but this will fail for  large 
so the sum = d1+ d2 +carry 
access LSD --> MSD
append from last
handle carry --> rev
*/
class Solution {
    public String addStrings(String num1, String num2) 
    {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) 
        {
            int d1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int d2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = d1 + d2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}