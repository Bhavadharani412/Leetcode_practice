impl Solution {
    pub fn get_last_moment(n: i32, left: Vec<i32>, right: Vec<i32>) -> i32 {
         let mut max = 0;
         for i in left{
            max = max.max(i);
        }
        for i in right {
            max = max.max(n - i);
        }
        max
    }
}