class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        // Start or destination is blocked
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }
        // 8 possible directions
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        boolean[][] visited = new boolean[n][n];
        // Queue stores: {row, col, pathLength}
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, 1});
        visited[0][0] = true;
        // bfs
        while(q.isEmpty() == false)
        {
            int[] curr = q.poll();
            int r = curr[0], c = curr[1], d = curr[2];
            if(r == n-1 && c == n-1) return d;
            for(int i = 0; i < 8; i++)
            {
                int nr = r + dx[i], nc = c + dy[i];
                if(nr < 0 || nr >= n || nc < 0 || nc >= n || grid[nr][nc] == 1)  continue;
                if(visited[nr][nc] == false)
                {
                    visited[nr][nc] = true;
                    q.offer(new int[]{nr, nc, d + 1});
                }
            }
        }
        return -1;
    }
}