class Solution {
    public boolean isPalindrome(String s) {
        String lowerCaseString = s.toLowerCase();
        String alphanumericOnly = lowerCaseString.replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(alphanumericOnly).reverse().toString();
        return alphanumericOnly.equals(reversed);
    }
}  
