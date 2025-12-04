class Solution {
    public int countCollisions(String directions) {
        int n = directions.length(), left = 0, right = n - 1;
        if(n == 1) return 0;
        while (left < right && directions.charAt(left) == 'L') left++;
        while (left < right && directions.charAt(right)=='R') right--;
        if(left >= right) return 0;
        int col = 0;
        for(; left <= right; col += (directions.charAt(left)!='S'?1:0),left++);
        return col;
    }
}