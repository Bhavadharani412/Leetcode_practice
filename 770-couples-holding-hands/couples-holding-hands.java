class Solution {
    public int minSwapsCouples(int[] row) {
        int n = row.length, swap = 0;
        int[] pos = new int[n];

        // place the position of the each individual
        for(int i = 0; i < n; i++) pos[row[i]] = i;

        // find check swap
        for(int i = 0; i < n; i+= 2)
        {
            int a = row[i], b = row[i+1]; // check the adj
            int pair = a ^ 1; // finds the pair
            if(pair == b) continue; // pair already
            else
            {
                int pair_ind = pos[pair]; // get pair pos
                row[i+1] = row[pair_ind]; // swap adj with pair
                row[pair_ind] = b; // update b with where pair was there 
                pos[row[pair_ind]] = pair_ind; // update b's index
                pos[row[i+1]] = i+1; // update pair's index
                swap++;
            }
        }
        return swap;
    }
}