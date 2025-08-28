impl Solution {
    pub fn two_sum(numbers: Vec<i32>, target: i32) -> Vec<i32> {
        for (i, num) in numbers.iter().enumerate() {
            let other = target - num;
            if let Ok(j) = numbers[i + 1..].binary_search(&other) {
                return vec![i as i32 + 1, (i + j) as i32 + 2];
            }
        }
        vec![]
    }
}