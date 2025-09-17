class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(n, "", ' ', ans);
        return ans;
  }   
    static void backtrack(int n, String current, char prevChar, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }
        backtrack(n, current + '1', '1', result);
        if (prevChar != '0') {
            backtrack(n, current + '0', '0', result);
        }
    }
}