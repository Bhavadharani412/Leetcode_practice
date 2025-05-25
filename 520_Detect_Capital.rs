impl Solution {
    pub fn detect_capital_use(word: String) -> bool {
        let caps = word.chars().filter(|c| c.is_uppercase()).count();
        let n = word.len();
        
        if caps == 0 {
            true
        } else if caps == n {
            true
        } else if caps == 1 && word.chars().next().unwrap().is_uppercase() {
            true
        } else {
            false
        }
    }
}
