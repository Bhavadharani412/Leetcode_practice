class Solution {
    public int[] findRightInterval(int[][] intervals) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<intervals.length;i++){
            map.put(intervals[i][0],i);
        }
        int[] start = new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            start[i] = intervals[i][0];
        }
        Arrays.sort(start);
        int[] res = new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            int temp = getIdx(intervals[i][1],start);
            if (temp == -1) res[i] = -1;
            else res[i] = map.get(start[temp]);
        }
        return res;
    }
    private int getIdx(int num,int[] start) {
        if(start[start.length - 1] < num) {
            return -1;
        }
        int left = 0;
        int right = start.length - 1;
        while(left < right) {
            int mid = left + (right - left)/2;
            if(start[mid] == num) return mid;
            else if(start[mid] > num) {
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}