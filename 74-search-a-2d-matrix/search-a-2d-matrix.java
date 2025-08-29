class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int len =  n * m;
        int start = 0, end = len - 1;
        while(start <= end){
            int mid = start +(end - start)/2;
            if(matrix[mid/m][mid % m] == target) return true;
            else if(matrix[mid/m][mid % m] > target) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
}