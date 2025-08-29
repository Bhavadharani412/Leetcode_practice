impl Solution {
    pub fn merge(nums1: &mut Vec<i32>, m: i32, nums2: &mut Vec<i32>, n: i32) {
        for j in 0..n as usize {
            nums1[m as usize + j] = nums2[j];
        }
        nums1.sort();
    }
}