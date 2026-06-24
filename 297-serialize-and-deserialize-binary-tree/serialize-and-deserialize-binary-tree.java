public class Codec {
    StringBuilder res;
    public String serialize(TreeNode root) {
        if(root == null) return "Null";
        int nullmark = Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        res = new StringBuilder();
        q.add(root);
        while(q.size() > 0)
        {
            TreeNode curr = q.remove();
            if(curr.val == nullmark){
                res.append("Null,");
                continue;
            }
            else{
                res.append(curr.val);
                res.append(",");
            }
            q.add((curr.left == null) ? new TreeNode(nullmark) : curr.left);
            q.add((curr.right == null) ? new TreeNode(nullmark) : curr.right);
        }
        res.deleteCharAt(res.length() - 1);
        System.out.println(res);
        return res.toString();
    }
    public TreeNode deserialize(String data) {
        if(data.equals("Null")) return null;
        String[] arr = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            TreeNode curr = q.poll();
            if (!arr[i].equals("Null")) {
                curr.left = new TreeNode(Integer.parseInt(arr[i]));
                q.offer(curr.left);
            }
            i++;
            if (i < arr.length && !arr[i].equals("Null")) {
                curr.right = new TreeNode(Integer.parseInt(arr[i]));
                q.offer(curr.right);
            }
            i++;
        }
        return root;
    }
}