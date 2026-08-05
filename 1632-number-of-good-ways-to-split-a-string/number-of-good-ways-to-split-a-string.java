class Solution {
    public int numSplits(String s) {
        HashMap<Character, Integer> right = new HashMap<>();
        HashSet<Character> left = new HashSet<>();
        int ans = 0, n = s.length();
        // compute right
        for(int i = 0; i < n; i++)
            right.put(s.charAt(i), right.getOrDefault(s.charAt(i), 0) + 1);
        for(int i = 0; i < n - 1; i++)
        {
            char ch = s.charAt(i);
            left.add(ch);
            right.put(ch, right.get(ch) - 1);
            if (right.get(ch) == 0)
                right.remove(ch);
            if (left.size() == right.size())
                ans++;
        }
        return ans;
    }
}