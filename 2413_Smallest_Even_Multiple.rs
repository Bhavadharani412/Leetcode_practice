impl Solution {
    pub fn smallest_even_multiple(mut n: i32) -> i32 {
        if n%2 == 0{
            return n;
        }
        n*2
    }
}
