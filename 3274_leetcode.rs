impl Solution {
    pub fn check_two_chessboards(coordinate1: String, coordinate2: String) -> bool {
        fn color(coordinate: &str) -> i32 {
            let col = coordinate.chars().nth(0).unwrap() as i32 - 'a' as i32;
            let row = coordinate.chars().nth(1).unwrap().to_digit(10).unwrap() as i32 - 1;
            (col + row) % 2
        }

        color(&coordinate1) == color(&coordinate2)
    }
}
