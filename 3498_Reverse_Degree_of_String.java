class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int product;
        for(int i=0;i<s.length(); i++){
            char letter = s.charAt(i);
            int degree = letter - 'a' + 1;
            int reverseDegree = 26 - degree + 1;
            product = reverseDegree * (i+1);
            sum +=product;
        }
        return sum;
    }
}
//int degree = letter - 'a' +
//; // Reverse position

