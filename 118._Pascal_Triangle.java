class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows >= 1)
            triangle.add(Arrays.asList(1));
        if (numRows >= 2)
            triangle.add(Arrays.asList(1, 1));
        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));
            for (int j = 1; j < i; j++) {
                int val = triangle.get(i - 1).get(j) + triangle.get(i - 1).get(j - 1);
                row.set(j, val);
            }
            triangle.add(row);
        }
        return triangle;
    }
}
