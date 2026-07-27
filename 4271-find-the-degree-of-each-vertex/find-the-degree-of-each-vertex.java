class Solution {
    public int[] findDegrees(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] degree = new int[m];
        for(int row = 0; row < m; row++)
        {
            int ones_cnt = 0;
            for(int  col = 0; col < n; col++)
            {
                if(matrix[row][col] == 1) ones_cnt++;
            }
            degree[row] = ones_cnt;
        }
        return degree;
    }
}