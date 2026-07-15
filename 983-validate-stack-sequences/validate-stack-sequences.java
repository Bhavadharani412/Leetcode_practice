/* *push from arr 1 to stack untill it maches popped
if matched check top of stack move popped 
check if the matched with stack top pop so remove from stack else insert next from stack
 */
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int push_point = 0, pop_point = 0;
        int len = pushed.length;
        Stack<Integer> st = new Stack<>();
        while (push_point < len) {
            // push current element
            st.push(pushed[push_point]);
            push_point++;
            
            // remove all matching elements
            while (!st.isEmpty() && st.peek() == popped[pop_point]) {
                st.pop();
                pop_point++;
            }
        }
        return st.isEmpty(); 
    }
}