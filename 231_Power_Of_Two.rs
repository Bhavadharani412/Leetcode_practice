impl Solution {
    pub fn is_power_of_two(n: i32) -> bool {
        if n <= 0 {
            return false;
        }
        if n == 1 {
            return true;
        }
        if n % 2 != 0 {
            return false;
        }
        Solution::is_power_of_two(n / 2)
    }
}
