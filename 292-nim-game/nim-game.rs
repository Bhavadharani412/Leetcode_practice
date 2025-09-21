impl Solution {
    pub fn can_win_nim(n: i32) -> bool {
        if n == 1 || n == 2 {
            return true;
        }
        else  {
            n % 4 != 0
        }
    }
}