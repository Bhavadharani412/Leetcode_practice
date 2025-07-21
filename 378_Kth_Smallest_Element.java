class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] arr = Arrays.stream(matrix).flatMapToInt(row -> Arrays.stream(row)).toArray();
        Arrays.sort(arr);
        return arr[k-1];
    }
}
