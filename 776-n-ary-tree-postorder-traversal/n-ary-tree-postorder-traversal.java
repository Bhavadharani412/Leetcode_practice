/*
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }
    public void preorder(Node root, List<Integer> res)
    {
        if(root == null) return;
        res.add(root.val);
        for(Node n : root.children)
        {
            preorder(n, res);
        }
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }
    public void postorder(Node root, List<Integer> res)
    {
        if(root == null) return;
        for(Node n : root.children)
        {
            postorder(n, res);
        }
        res.add(root.val);
    }
}