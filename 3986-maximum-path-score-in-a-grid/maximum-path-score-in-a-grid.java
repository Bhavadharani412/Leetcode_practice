class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][][] dp = new int[m][n][k + 1];
        for (int[][] arr2D : dp)
            for (int[] arr : arr2D)
                Arrays.fill(arr, -1);
        dp[0][0][0] = 0; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int s = (grid[i][j] == 2) ? 2 : (grid[i][j] == 1 ? 1 : 0);
                int cost = (grid[i][j] == 0) ? 0 : 1;
                for (int c = cost; c <= k; c++) {
                    int best = -1;

                    if (i > 0 && dp[i - 1][j][c - cost] != -1)
                        best = Math.max(best, dp[i - 1][j][c - cost]);
                    if (j > 0 && dp[i][j - 1][c - cost] != -1)
                        best = Math.max(best, dp[i][j - 1][c - cost]);

                    if (i == 0 && j == 0 && c == cost)
                        best = 0; 
                    if (best != -1)
                        dp[i][j][c] = Math.max(dp[i][j][c], best + s);
                }
            }
        }
        int ans = -1;
        for (int c = 0; c <= k; c++) {
            ans = Math.max(ans, dp[m - 1][n - 1][c]);
        }
        return ans;
    }
}