class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0, end = nums.length - 1;
        return createTree(nums, start, end);
    }
    private TreeNode createTree(int[] nums, int start, int end)
    {
        if(start > end) return null;
        int mid = start + (end -  start)/2;
        TreeNode n1 = new TreeNode(nums[mid]);
        n1.left = createTree(nums, start, mid - 1);
        n1.right = createTree(nums, mid+1, end);
        return n1;
    }
}