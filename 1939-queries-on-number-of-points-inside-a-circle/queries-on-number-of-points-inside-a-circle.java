class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] arr = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int qx = queries[i][0];
            int qy = queries[i][1];
            int r = queries[i][2];
            int count = 0;
            for(int j = 0; j < points.length; j++){
               int px = points[j][0];
               int py = points[j][1]; 
               if(Math.pow((px-qx),2) + Math.pow((py-qy),2) <= r * r)
                    count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}