impl Solution {
    pub fn xor_game(nums: Vec<i32>) -> bool {
        let n = nums.len();
        let mut xor = 0;
        for i in nums{
            xor ^= i;
        }
        let a : bool = (xor == 0);
        let b : bool = (n % 2 == 0);
        a || b
    }
}