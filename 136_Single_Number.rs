impl Solution {
    pub fn single_number(nums: Vec<i32>) -> i32 {
        let mut xorr = 0;
        for n in nums{
            xorr ^= n;
        }
        xorr
    }
}
