class Solution {
    public TreeNode recoverFromPreorder(String s) {
       Stack<TreeNode> st = new Stack<>();
       int ind = 0;
       while(ind < s.length())
       {
            int dep = 0;
            while(ind < s.length() && s.charAt(ind) == '-')
            {
                dep++; // no of dashes == depth 
                ind++;
            }
            int val = 0;
            while(ind < s.length() && Character.isDigit(s.charAt(ind)))
            {
                val = val * 10 + (s.charAt(ind) - '0'); // the number may be 200 so 
                // converting char to num
                ind++;
            }
            TreeNode node = new TreeNode(val); // creating a node of the val
            while(st.size() > dep) st.pop(); 
            if(st.isEmpty() == false)
            {
                if(st.peek().left == null) st.peek().left = node;
                else st.peek().right = node;
            }
            st.push(node);
       }
       while(st.size() > 1) st.pop();
       return st.peek();
    }
}