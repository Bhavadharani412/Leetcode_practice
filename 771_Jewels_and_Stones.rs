impl Solution {
    pub fn num_jewels_in_stones(jewels: String, stones: String) -> i32 {
        let mut count:i32 =  0;
        for i in jewels.chars() {
        for j in stones.chars() {
            if i == j {
                count += 1;
            }
        }
    }
    count
    }
}
