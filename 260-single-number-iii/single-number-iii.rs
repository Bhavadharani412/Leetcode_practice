impl Solution {
    pub fn single_number(nums: Vec<i32>) -> Vec<i32> {
        let mut xor_sum = 0;
        for &num in &nums {
            xor_sum ^= num;
        }
        let diff = xor_sum & (-xor_sum); 

        let mut num1 = 0;
        let mut num2 = 0;

        for &num in &nums {
            if (num & diff) == 0 {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        vec![num1, num2]
    }
} 