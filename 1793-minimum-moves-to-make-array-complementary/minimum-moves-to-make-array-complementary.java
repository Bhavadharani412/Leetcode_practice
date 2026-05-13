class Solution {
    public int minMoves(int[] nums, int limit) {
        int len = nums.length;
        int[] res = new int[(limit << 1) + 2];
        for(int i = 0; i < len >> 1; i++){
            int min = Math.min(nums[i], nums[len - 1 - i]);
            int max = Math.max(nums[i], nums[len - 1 - i]);
            res[2] += 2;
            res[min + 1]--;
            res[min + max]--;
            res[min + max + 1]++;
            res[max + limit + 1]++;
        }
        int out = len, mov = 0; 
        for(int i = 2; i <= limit * 2; i++){
            mov += res[i];
            out = Math.min(out, mov);
        }
        return out;
    }
}