class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int cnt = 0;
        for(int i = 0; i < n; i++)
        {
            if(vis[i] == false)
            {
                dfs(i, vis, isConnected, n);
                cnt++;
            }
        }
        return cnt;
    }
    private void dfs(int node, boolean[] vis, int[][] arr, int n)
    {
        vis[node] = true;
        for(int i = 0; i < n; i++){
            if(arr[node][i] == 1 && !vis[i]) dfs(i, vis, arr, n);
        }
    }
}