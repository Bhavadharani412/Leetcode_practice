impl Solution {
    pub fn find_the_difference(s: String, t: String) -> char {
        let mut ascii1 = 0;
        let mut ascii2 = 0;
        for i in 0..s.len(){
            ascii1 += s.chars().nth(i).unwrap() as u8 as i32;
        }
        for i in 0..t.len(){
            ascii2 += t.chars().nth(i).unwrap() as u8 as i32;
        }
        let diff = ascii2 - ascii1;
        let a = diff as u8 as char;
        a
    }
}
