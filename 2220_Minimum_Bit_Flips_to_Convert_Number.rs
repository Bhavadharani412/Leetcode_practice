impl Solution {
    pub fn min_bit_flips(start: i32, goal: i32) -> i32 {
        let mut d = start ^ goal;
        let mut count = 0;
        while d != 0 {
            d &= d - 1;
            count += 1;
        }
        count
    }
}
