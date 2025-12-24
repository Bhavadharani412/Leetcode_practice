impl Solution {
    pub fn minimum_boxes(apple: Vec<i32>, mut capacity: Vec<i32>) -> i32 {
        let total1: i32 = apple.iter().sum();
        let mut count: i32 = 0;
        let mut total2: i32 = 0;
        capacity.sort_by(|a, b| b.cmp(a));
        for cap in capacity {
            total2 += cap;
            count += 1;
            if total2 >= total1 {
                break;
            }
        }
        count
    }
}
