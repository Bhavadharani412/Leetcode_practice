class Solution {
    public String addBinary(String a, String b) {
        char[] charArrA = a.toCharArray();
        char[] charArrB = b.toCharArray();
        StringBuilder sb = new StringBuilder();

        int i = charArrA.length - 1, j = charArrB.length - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int num1 = i >= 0 ? charArrA[i] - '0' : 0;
            int num2 = j >= 0 ? charArrB[j] - '0' : 0;
            int sum = num1 + num2 + carry;
            int digit = sum % 2;
            carry = sum / 2;
            i--;
            j--;
            sb.append((char)(digit + '0'));
        }
        return sb.reverse().toString();
    }
}