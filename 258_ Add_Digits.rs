impl Solution {
    pub fn add_digits(mut num: i32) -> i32 {
        let mut ans = 0;
        if num<10{
            return num;
        } 
        while num != 0 {
            ans += num % 10;
            num/=10;
        }
        Solution::add_digits(ans)
    }
}
