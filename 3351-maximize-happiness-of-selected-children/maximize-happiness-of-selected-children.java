class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int dec = 0;
        long sum = 0;
        for(int i = happiness.length - 1; i>=happiness.length-k;i--){
            sum += (happiness[i] + dec > 0)? (long)(happiness[i] + dec) : 0;
            dec--;
        }
        return sum;
    }
}