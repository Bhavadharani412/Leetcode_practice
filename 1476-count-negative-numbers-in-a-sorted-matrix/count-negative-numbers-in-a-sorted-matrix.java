class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length, cols = grid[0].length,r = 0,c = cols - 1,count = 0;
        while (r < rows && c >= 0) {
            if (grid[r][c] < 0) {
                count += (rows - r);
                c--;
            } else r++;
        }
        return count;
    }
}