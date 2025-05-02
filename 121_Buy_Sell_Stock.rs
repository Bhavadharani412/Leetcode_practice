impl Solution {
    pub fn max_profit(prices: Vec<i32>) -> i32 {
        let mut profit = 0;
        let mut min = prices[0];
        for i in 1..prices.len(){
            if min >prices[i]{ min = prices[i];}
            profit = profit.max(prices[i] - min);
        }
        profit
    }
}
