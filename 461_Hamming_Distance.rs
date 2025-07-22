impl Solution {
    pub fn hamming_distance(x: i32, y: i32) -> i32 {
        let mut d = x ^ y;
        let mut count = 0;
        while d != 0 {
            d &= d - 1;
            count += 1;
        }
        count
    }
}
