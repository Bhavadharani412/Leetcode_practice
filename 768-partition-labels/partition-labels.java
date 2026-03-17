class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        List<Integer> result = new ArrayList<>();
        int prev = -1;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, lastIndex[s.charAt(i) - 'a']);
            if (max == i) {
                result.add(max - prev);
                prev = max;
            }
        }
        return result;
    }
}