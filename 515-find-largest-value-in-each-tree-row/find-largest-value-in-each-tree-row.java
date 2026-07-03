// bfs --> find max
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Integer> maxList = new ArrayList<>();
        while(!q.isEmpty()){
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                if(curr.left != null)q.offer(curr.left);
                if(curr.right != null)q.offer(curr.right);
                max = Math.max(curr.val, max);
            }
            maxList.add(max);
        }
        return maxList;
    }
}