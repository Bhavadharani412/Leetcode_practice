class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] mincost = new int[len];
        mincost[0] = cost[0];
        mincost[1] = cost[1];
        for(int iter = 2; iter < len; iter++){
            mincost[iter] = cost[iter];
            mincost[iter] += Math.min(mincost[iter-2],mincost[iter-1]);
        }
        return Math.min(mincost[len - 1], mincost[len-2]);
    }
}