impl Solution {
    pub fn maximum_xor(nums: Vec<i32>) -> i32 {
        let mut ans : i32 = 0;
        for i in nums {
            ans |= i;
        }
        ans
    }
}