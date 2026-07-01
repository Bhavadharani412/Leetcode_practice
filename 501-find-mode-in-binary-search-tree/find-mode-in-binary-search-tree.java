class Solution {
    HashMap<Integer, Integer> hm = new HashMap<>();
    public int[] findMode(TreeNode root) {
        preorder(root);
        int max = Integer.MIN_VALUE;
        for (int freq : hm.values()) {
            max = Math.max(max, freq);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    private void preorder(TreeNode root) {
        if (root == null) return;
        hm.put(root.val, hm.getOrDefault(root.val, 0) + 1);
        preorder(root.left);
        preorder(root.right);
    }
}