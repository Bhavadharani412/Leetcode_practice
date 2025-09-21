class Solution {
    public int countPermutations(int[] complexity) {
        final int MODULO = 1_000_000_007;
        int n = complexity.length;
        for(int i = 1; i < n; i++){
            if(!(complexity[0] < complexity[i])){
                return 0;
            }
        }
        long ans = 1;
        for(int i = 2; i< n; i++){
            ans = (ans * i) % MODULO;
        }
        return (int) ans;
    }
}