impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut l = 0;
        let mut r = nums.len() - 1;
        while l < r {
            let sum = nums[l] + nums[r];
            if sum == target {
                return vec![(l + 1) as i32, (r + 1) as i32]; 
            } else if sum < target {
                l += 1;
            } else {
                r -= 1; 
            }
        }
        vec![]
    }
}