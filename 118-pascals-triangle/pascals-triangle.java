class Solution {
    public List<List<Integer>> generate(int numRows) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     for(int i=0;i<numRows;i++){
    //         ans.add(new ArrayList<Integer>());
    //         for(int j=0;j<=i;j++){
    //             if(j==0 || j==i){
    //                  ans.get(i).add(j,1);
    //         }
    //         else{
    //             int val = ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
    //             ans.get(i).add(j,val);
    //         }
    //     }
    // }
    // return ans;
    List<List<Integer>> list = new ArrayList<>();
    for(int row=1;row<=numRows;row++){
        List<Integer> b = new ArrayList<>();
        list.add(generateRow(row));
    }
    return list;

    }
    public List<Integer> generateRow(int n){
        List<Integer> ans = new ArrayList<>();
        int a = 1;
        ans.add(1);
        for(int i=1;i<n;i++){
            a = a*(n-i);
            a = a/i;
            ans.add(a);
        }
        return ans;
    }
}