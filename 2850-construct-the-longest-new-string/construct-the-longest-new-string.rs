impl Solution {
    pub fn longest_string(x: i32, y: i32, z: i32) -> i32 {
        let min = x.min(y);
        if x == y{
            (4 * x + 2 * z)
        }
        else {
            (2 * min + (min + 1) * 2 + 2 * z)
        }
    }
}