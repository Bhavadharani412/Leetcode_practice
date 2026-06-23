class Solution {
    int[] depth;
    int[] levelarr;
    int[] max1;
    int[] max2;
    public int[] treeQueries(TreeNode root, int[] queries) {
        depth = new int[100001];
        levelarr = new int[100001];
        max1 = new int[100001];
        max2 = new int[100001];
        height(root , 0);
        int len = queries.length;
        for(int trav = 0; trav < len; trav++)
        {
            int q = queries[trav];
            int level = levelarr[q];
            queries[trav] = (max1[level] == depth[q] ? max2[level] : max1[level]) + level - 1; 
        }
        return queries;
    }
    public int height(TreeNode root, int level)
    {
        if(root == null) return 0;
        levelarr[root.val] = level;
        depth[root.val] = 1 + Math.max(height(root.left, level +1), height(root.right, level + 1));
        if(max1[level] < depth[root.val])
        {
            max2[level] = max1[level];
            max1[level] = depth[root.val];
        }
        else if(max2[level] < depth[root.val])
        {
            max2[level] = depth[root.val];
        }
        return depth[root.val];
    }
}