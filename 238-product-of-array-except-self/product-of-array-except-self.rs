impl Solution {
    pub fn product_except_self(nums: Vec<i32>) -> Vec<i32> {
        let n = nums.len();
        let mut ans = vec![1; n];
        let mut curr = 1;
        for i in 0..n {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for i in (0..n).rev() { 
            ans[i] *= curr;
            curr *= nums[i];
        }
        ans
    }
}