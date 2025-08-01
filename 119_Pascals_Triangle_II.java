class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        long val = 1;
        result.add((int)val);
        for (int k = 1; k <= rowIndex; k++) {
            val = val * (rowIndex - k + 1) / k;
            result.add((int)val);
        }
        return result;
    }
}
