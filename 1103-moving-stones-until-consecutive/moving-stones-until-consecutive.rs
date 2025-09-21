impl Solution {
    pub fn num_moves_stones(a: i32, b: i32, c: i32) -> Vec<i32> {
        let max_val = std::cmp::max(c, std::cmp::max(a, b));
        let min_val = std::cmp::min(c, std::cmp::min(a, b));
        let max1 = max_val - min_val - 2;
        let min1 = std::cmp::max(
            std::cmp::min(
                3,
                std::cmp::min(
                    (a - b).abs(),
                    std::cmp::min((b - c).abs(), (a - c).abs()),
                ),
            ) - 1,
            1,
        );
        let min1 = if max1 == 0 { 0 } else { min1 };
        vec![min1, max1]
    }
}