class Solution 
{
    HashSet<Integer> set;
    public boolean isUnivalTree(TreeNode root) 
    {
        set = new HashSet<>();
        preorder(root, set);
        return (set.size() == 1);        
    }
    private void preorder(TreeNode root, HashSet<Integer> set)
    {
        if(root == null) return;
        set.add(root.val);
        preorder(root.left, set);
        preorder(root.right, set);
    }
}