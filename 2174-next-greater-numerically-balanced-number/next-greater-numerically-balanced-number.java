class Solution {
    public int nextBeautifulNumber(int n) {
        int left = n, right = Integer.MAX_VALUE, opti = 0;
        for(int i = left + 1; i <= right;++i){
            if(possible(i)){
                opti = i;
                return opti;
            }
        }
        return -1;
    }
    private boolean possible(int a){
        int[] map = new int[10];
        while(a != 0){
            map[a % 10]++;
            a /= 10;
        }
        for(int i = 0; i < 10;i++){
            if(map[i] > 0 && map[i] != i)
            return false;
        }
        return true;
    }
}