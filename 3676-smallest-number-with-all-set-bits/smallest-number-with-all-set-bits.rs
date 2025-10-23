impl Solution {
    pub fn smallest_number(n: i32) -> i32 {
        let ans = (n as f64).log2() as i32 + 1;
        (1 << ans) - 1
    }
}