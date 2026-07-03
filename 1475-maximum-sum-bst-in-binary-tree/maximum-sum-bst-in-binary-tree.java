class Solution {
    int ans;
    public int maxSumBST(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }
    private int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        }
        int[] leftSubtree = dfs(root.left);
        int[] rightSubtree = dfs(root.right);
        if (root.val > leftSubtree[1] && root.val < rightSubtree[0]) {
            int currSum = leftSubtree[2] + rightSubtree[2] + root.val;
            ans = Math.max(ans, currSum);

            int minValue = Math.min(root.val, leftSubtree[0]);
            int maxValue = Math.max(root.val, rightSubtree[1]);

            return new int[]{minValue, maxValue, currSum};
        }
        return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 0};
    }
}