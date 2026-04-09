class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        int size = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                StringBuilder num = new StringBuilder();
                while(i < size && Character.isDigit(s.charAt(i))) {
                    num.append(s.charAt(i));
                    i++;
                }
                st.push(num.toString());
                i--; 
            }
            else if(c == '[') {
                st.push("-1"); // marker for [
            }
            else if(c == ']') {
                StringBuilder temp = new StringBuilder();
                while(st.peek() != "-1") {
                    temp.insert(0, (String)st.pop());
                }
                st.pop(); // pop the marker
                int count = Integer.parseInt(st.pop()); // get the number of times to repeat
                String repeated = temp.toString().repeat(count);
                st.push(repeated); // push the repeated string back to stack
            }
            else {
                st.push(c + ""); // push the character as string
            }
        }
        while(!st.isEmpty()) {
            ans.insert(0, (String)st.pop());
        }
        return ans.toString();
    }
}