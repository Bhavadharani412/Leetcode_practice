/* check root value if it less than val move right, 
else go left recursion
*/
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        if(root.val > val){
            if(root.left == null){
                root.left = new TreeNode(val);
                return root;
            }
            insertIntoBST(root.left, val);
        } 
        else{
            if(root.right == null){
                root.right = new TreeNode(val);
                return root;
            }
            insertIntoBST(root.right, val);
        }
        return root;
    }
}