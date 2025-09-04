impl Solution {
    pub fn find_closest(x: i32, y: i32, z: i32) -> i32 {
        if (x - z).abs() <  (y - z).abs() {
            1 as i32
        }
        else if (x - z).abs() == (y - z).abs(){
            0 as i32
        }
        else{
            2 as i32
        }
    }
}