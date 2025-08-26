class Solution {
    public String decodeMessage(String key, String message) {
        List<Character> key1 = new ArrayList<>();
        char[] abc = new char[26];
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for(int i = 97;i < 123; i++) 
        abc[j++]=(char)i;
        for(int i = 0;i < key.length(); i++){
            if(key.charAt(i) !=' '  && !key1.contains(key.charAt(i))){
                key1.add(key.charAt(i));
            }
        }
        for(int i=0;i < message.length(); i++){
            if(message.charAt(i) == ' ') 
            sb.append(" ");
            else {
                int index = key1.indexOf(message.charAt(i));
                sb.append(String.valueOf(abc[index]));
            }
        }
        return sb.toString();
    }
}