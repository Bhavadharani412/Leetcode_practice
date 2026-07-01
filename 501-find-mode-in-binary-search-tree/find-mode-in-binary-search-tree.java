class Solution {
    TreeNode prev = null;
    int count = 0;
    int maxcount = 0;
    List<Integer> modes = new ArrayList<>();    
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] ans = new int[modes.size()];
        for(int i =0; i<ans.length;i++){
            ans[i] = modes.get(i);
        }
        return ans;
    }
    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);  
        if(prev==null) count=1;
        else if(prev.val==root.val) count++;
        else count = 1;
        if(count>maxcount){
            maxcount=count;
            modes.clear();
            modes.add(root.val);
        }
        else if(count==maxcount) modes.add(root.val);
        prev=root;
        inorder(root.right);
    }
}