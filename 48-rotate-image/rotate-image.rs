impl Solution {
    pub fn rotate(mat: &mut Vec<Vec<i32>>) {
        let n = mat.len();
        for i in 0..n {
            for j in (i + 1)..n {
                let temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for i in 0..n {
            let mut start = 0;
            let mut end = n - 1;
            while start < end {
                let temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start += 1;
                end -= 1;
            }
        }
    }
}