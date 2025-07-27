impl Solution {
    pub fn min_operations(nums: Vec<i32>, k: i32) -> i32 {
        let mut total = 0;
    for num in nums {
        total += num;
    }
    total % k
    }
}
