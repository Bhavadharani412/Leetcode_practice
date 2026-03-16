class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] copy = new int[n];
        int cnt = 0;
        for(int i = 0; i < n;copy[i] = heights[i], i++);
        Arrays.sort(copy);
       for(int i = 0; i < n; i++){
           if(heights[i] != copy[i]) cnt++;
       }
        return cnt;
    }
}