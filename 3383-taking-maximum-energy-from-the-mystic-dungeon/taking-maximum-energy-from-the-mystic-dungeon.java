class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length, max = Integer.MIN_VALUE;
        for(int i = n - k; i < n;i++){
            max = Math.max(max, energy[i]);
        }
        for(int i = n - k - 1; i >-1;i--){
            energy[i] += energy[i+k];
            max = Math.max(max, energy[i]);
        }
        return max;
    }
}