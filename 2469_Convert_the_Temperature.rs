impl Solution {
    pub fn convert_temperature(celsius: f64) -> Vec<f64> {
        let mut vec :Vec<f64>= vec![0.0, 0.0]; 
        vec[0] = celsius +273.15;
        vec[1] = (celsius*1.80)+32.00;
        vec
    }
}
