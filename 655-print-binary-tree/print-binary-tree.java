class Solution {
    public List<List<String>> printTree(TreeNode root) 
    {
        int height ;
        int row;
        int col;
        height = height_finder(root); // height
        row = height + 1;
        col = (int) (Math.pow(2, row)) - 1;
        List<List<String>> bt_list = new ArrayList<>(row);
        for (int i = 0; i < row; i++) 
        {
            List<String> rowList = new ArrayList<>();
            for (int j = 0; j < col; j++) 
            {
                rowList.add(""); // each cell must be a String
            }
            bt_list.add(rowList);
        }
        // root node placement
        // int root_ind;
        // root_ind = (col - 1) / 2;
        // String val = String.valueOf(root.val);
        // bt_list.get(0).set(root_ind, val);
        
        dfs(root, bt_list, 0, (col - 1) / 2, height);
        // left  at bt_list.get(r+1).set(c-2^(height-r-1), root.val);
        // right at bt_list.get(r+1).set(c + 2^(height-r-1), root.val);
        // do dfs if u are  moving right add at right pos
        return bt_list;
    }
    private void dfs(TreeNode node, List<List<String>> list, int r, int c, int height) 
    {
        if (node == null) return;
        list.get(r).set(c, String.valueOf(node.val));
        int offset = (int) Math.pow(2, height - r - 1);
        dfs(node.left, list, r + 1, c - offset, height);
        dfs(node.right, list, r + 1, c + offset, height);
    }
    private int height_finder(TreeNode node)
    {
        if(node == null) return -1;
        int left_height;
        int right_height;
        int height;
        left_height = height_finder(node.left);
        right_height = height_finder(node.right);
        height = 1 + ((left_height > right_height) ? left_height : right_height);
        return height; 
    }
}