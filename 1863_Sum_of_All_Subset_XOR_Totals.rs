impl Solution {
    pub fn subset_xor_sum(nums: Vec<i32>) -> i32 {
        let mut or = 0;
        for &i in nums.iter(){
           or |=  i;
        }
        or * 2_i32.pow((nums.len() - 1) as u32)
    }
}
