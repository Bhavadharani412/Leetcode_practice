impl Solution {
    pub fn is_power_of_three(n: i32) -> bool {
        if n <= 0 {
            return false;
        }
        if n == 1 {
            return true;
        }
        if n % 3 != 0 {
            return false;
        }
        Solution::is_power_of_three(n / 3)
    }
}
