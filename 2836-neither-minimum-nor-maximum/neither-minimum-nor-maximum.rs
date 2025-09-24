impl Solution {
    pub fn find_non_min_or_max(nums: Vec<i32>) -> i32 {
        if nums.len() < 3 {
            -1
        } else {
            let (a, b, c) = (nums[0], nums[1], nums[2]);
            a + b + c - a.min(b.min(c)) - a.max(b.max(c))
        }
    }
}