impl Solution {
    pub fn flower_game(n: i32, m: i32) -> i64 {
        let even_n: i64 = (n as i64) / 2;
        let odd_n: i64 = (n as i64) - even_n;
        let even_m: i64 = (m as i64) / 2;
        let odd_m: i64 = (m as i64) - even_m;
        (even_n * odd_m) + (odd_n * even_m)
    }
}