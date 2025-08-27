impl Solution {
    pub fn max_product(nums: Vec<i32>) -> i32 {
        let mut prod = 1;
        let mut max = nums[0];
        let n = nums.len();
        for i in 0..n{
            prod *= nums[i];
            max = max.max(prod);
            if prod == 0 {
                prod = 1;
            }
        }
        prod = 1;
        for i in (0..n).rev(){
            prod *= nums[i];
            max = max.max(prod);
            if prod == 0 {
                prod = 1;
            }
        }
        max
    }
}