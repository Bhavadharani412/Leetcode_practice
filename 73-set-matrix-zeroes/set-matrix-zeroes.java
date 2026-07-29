class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean fir_row = false, fir_col = false;
        for(int i = 0; i < n; i++)
        {
            if(matrix[0][i] == 0) fir_row = true;
        }
        for(int i = 0; i < m; i++)
        {
            if(matrix[i][0] == 0) fir_col = true;
        }
        // marker 
        for(int i =1; i < m; i++)
        {
            for(int j = 1; j < n; j++)
            {
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // fill karo
        for (int i = 1; i < m; i++) 
        {
            for (int j = 1; j < n; j++) 
            {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) 
                    matrix[i][j] = 0;
            }
        }
        if(fir_row)
        {
            for(int i = 0; i < n; i++) matrix[0][i] = 0;
        }
        if(fir_col) for(int i = 0; i < m; i++) matrix[i][0] = 0;
    }
}