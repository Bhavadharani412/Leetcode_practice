impl Solution {
    pub fn count_negatives(grid: Vec<Vec<i32>>) -> i32 {
        let rows = grid.len();
        if rows == 0 {
            return 0;
        }
        let cols = grid[0].len();
        if cols == 0 {
            return 0;
        }
        let mut r = 0;
        let mut c = cols as i32 - 1;
        let mut count = 0;
        while (r as usize) < rows && c >= 0 {
            if grid[r as usize][c as usize] < 0 {
                count += (rows - (r as usize)) as i32;
                c -= 1;
            } else{
                r += 1;
            } 
        }
        count
    }
}