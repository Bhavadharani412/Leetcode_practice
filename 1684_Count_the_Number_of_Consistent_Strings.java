class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int invalidCount = 0;
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (allowed.indexOf(c) == -1) {
                    invalidCount++;
                    break; 
                }
            }
        }
        return words.length - invalidCount;
    }
}
