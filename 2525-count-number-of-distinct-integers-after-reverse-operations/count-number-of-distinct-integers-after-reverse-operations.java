class Solution {
    public int countDistinctIntegers(int[] nums) {
        int max = 1000000;
        int cnt = 0;
        boolean[] visited = new boolean[max+1];
        for ( int num : nums ) {
            if ( !visited[num] ) {
                visited[num] = true;
                cnt++;
            }
            int reversed = 0;
            while ( num > 0 ) {
                reversed = reversed * 10 + (num % 10);
                num /= 10;
            }
            if ( !visited[reversed] ) {
                visited[reversed] = true;
                cnt++;
            }
        }
        return cnt;
    }
}