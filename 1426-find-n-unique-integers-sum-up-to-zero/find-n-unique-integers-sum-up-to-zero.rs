impl Solution {
    pub fn sum_zero(n: i32) -> Vec<i32> {
      let mut res = Vec::with_capacity(n as usize);
        if n % 2 != 0 {
            res.push(0);
        }
        for i in 1..=(n / 2) {
            res.push(i);
            res.push(-i);
        }
        res  
    }
}
