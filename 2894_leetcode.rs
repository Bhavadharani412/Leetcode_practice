impl Solution {
    pub fn difference_of_sums(n: i32, m: i32) -> i32 {
        let  t = (n * (n + 1)) / 2; 
        let mut sum =0;
        for i in 1..=n{
        if i % m == 0{
            sum += i;
        }
    }
    let d = t - sum;
    d-sum
    }
}
