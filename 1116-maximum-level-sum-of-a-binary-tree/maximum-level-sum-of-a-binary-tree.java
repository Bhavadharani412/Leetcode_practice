class Solution {
    ArrayList<Integer> ls = new ArrayList<>();
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        dfs(root, 0);
        int ans = 1;
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i) > max) {
                max = ls.get(i);
                ans = i + 1;
            }
        }
        return ans;
    }
    private void dfs(TreeNode root, int level) {
        if (root == null) return;
        if (level == ls.size())
            ls.add(root.val);
        else 
            ls.set(level, ls.get(level) + root.val);
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}