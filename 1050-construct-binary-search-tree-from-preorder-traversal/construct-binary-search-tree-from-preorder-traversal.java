/**
preorder + bst 
small than root ? left subtree
large than root ? right subtree
null insert there recurse
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        int len = preorder.length;
        TreeNode root = new TreeNode(preorder[0]);
        for(int i = 1; i < len; i++)
        {
            build(root, preorder[i]);
        }
        return root;
    }
    private TreeNode build(TreeNode root, int val){
        if(root == null) return new TreeNode(val);
        if(val < root.val) {
            root.left = build(root.left, val);
        }
        else if(val > root.val) {
            root.right = build(root.right, val);
        }
        return root;
    }
}