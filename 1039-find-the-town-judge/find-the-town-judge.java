class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1) return 1;
        int[] tr_cnt = new int[n+1];
        int m = trust.length;
        for(int row = 0; row < m; row++)
        {
            int src = trust[row][0], des = trust[row][1];
            tr_cnt[src]--;
            tr_cnt[des]++;
        }
        // because I used 0, 1... n (inclusive)
        for(int iter = 0; iter <= n; iter++)
        {
            if(tr_cnt[iter] == n-1) return iter;
        }
        return -1;
    }
}