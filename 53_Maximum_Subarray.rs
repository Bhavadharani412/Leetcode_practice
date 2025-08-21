impl Solution {
    pub fn max_sub_array(nums: Vec<i32>) -> i32 {
        let mut res = nums[0];
        let mut max = nums[0];
        for i in 1..nums.len(){
            max = max.max(0) + nums[i];
            res = res.max(max);
        }
        res
    }
}
