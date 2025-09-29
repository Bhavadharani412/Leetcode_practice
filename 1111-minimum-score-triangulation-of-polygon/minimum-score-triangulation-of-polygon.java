public class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1; 
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    int triangleScore = values[i] * values[k] * values[j];
                    int totalScore = triangleScore + dp[i][k] + dp[k][j];
                    dp[i][j] = Math.min(dp[i][j], totalScore);
                }
            }
        }
        return dp[0][n - 1];
    }
}