class Solution {
    public int minTimeToType(String word) {
        int res = word.length();
        char point = 'a';
        for (char ch : word.toCharArray()) {
            int diff = Math.abs(ch - point);
            res += Math.min(diff, 26 - diff);
            point = ch;
        }
        return res;
    }
}