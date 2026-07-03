/** 
## approach 1
bst la inorder panna sorted list kediakkum at the same time compare both roots and add accordingly in list
or else add once then sort
## approach 2
oru pointeer l1 = 0, l2 = 0 --> l1 val  l2.val compare add smaller to list, move the pointer to next in smaller,
[1, 2,4] l1
[0,1,3] l2 , l2 over so add remaining fromother list as it is
res [0,1, 1,2, 3,4]
## approach 3
pass root1 to inorder 
[1, 2, 4] 
now track the pointer size() -1 this marks tree 1 end
pass root 2 to inorder
[1, 2, 4, 0, 1, 3]
ts1 = 0, te1 = size() -1, ts2 = te1 + 1, te2 = size()-1
check ts1 val and te1 compare add to final list 
increase pointer by one where smaller is found
ts2++, ts1 == ts2, ts2++, ts1 (1) < ts2 2 ts1++,
2 < 3 ts1++ 4> 3 add if (ts2 == te2) add remaining from ts1 to te1 or ts2 to te2
[0, 1,1,2,3,4]
*/
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) 
    {
        inorder(root1);
        int tree1End = list.size() - 1;
        inorder(root2);
        int tree2Start = tree1End + 1;
        int tree2End = list.size() - 1;
        List<Integer> ans = new ArrayList<>();
        int i = 0; // ts1
        int j = tree2Start; // ts2
        while (i <= tree1End && j <= tree2End) {
            if (list.get(i) <= list.get(j)) {
                ans.add(list.get(i++));
            } 
            else {
                ans.add(list.get(j++));
            }
        }
        while (i <= tree1End) {
            ans.add(list.get(i++));
        }
        while (j <= tree2End) {
            ans.add(list.get(j++));
        }
        return ans;
    }
    public void inorder(TreeNode root){
        if(root == null) return ;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}