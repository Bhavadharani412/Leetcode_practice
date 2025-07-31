class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1) return word;
        StringBuilder string1 = new StringBuilder(word.substring(0, index + 1));
        string1.reverse().append(word.substring(index + 1));
        return string1.toString();
    }
}
