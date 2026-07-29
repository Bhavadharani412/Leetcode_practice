class Solution {
    private List<Integer> generateRow(int row) {
        List<Integer> ans = new ArrayList<>(Collections.nCopies(row + 1, 1));
        long val = 1;
        int mid = row / 2;
        for (int r = 1; r <= mid; r++) {
            val = val * (row - r + 1);
            val /= r;
            ans.set(r, (int) val);
            ans.set(row - r, (int) val);
        }
        return ans;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            res.add(generateRow(row));
        }
        return res;
    }
}