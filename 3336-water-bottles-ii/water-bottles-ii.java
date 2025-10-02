class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int res = numBottles, empty = numBottles;
        while(empty >= numExchange){
            empty -= numExchange;
            numExchange++;
            res++;
            empty++;
        }
        return res;
    }
}