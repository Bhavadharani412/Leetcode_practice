class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        char[] broken = brokenLetters.toCharArray();
        String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            boolean valid = true;
            for (char c : word.toCharArray()) {
                for (char b : broken) {
                    if (c == b) {
                        valid = false;
                        break;
                    }
                }
                if (!valid) break;
            }
            if (valid) count++;
        }
        return count;
    }
}