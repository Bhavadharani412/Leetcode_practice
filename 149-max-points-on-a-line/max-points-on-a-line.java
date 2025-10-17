class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length, count = Integer.MIN_VALUE;
        if(n == 1) return 1;
        for(int i = 0; i < n;i++){
            int x1 = points[i][0], y1 = points[i][1];
            Map<String, Integer> slope = new HashMap<>();
            int rep = 1, maxP = Integer.MIN_VALUE;
            for(int j = i+1; j < n;j++){
               int x2 = points[j][0], y2 = points[j][1]; 
               if(x1 == x2 && y1 == y2){
                    rep++;
                    continue;
                }
                int x = x2-x1, y = y2-y1;
                int gcd = gcd(x,y);
                x /= gcd;
                y /= gcd;
                if((x < 0 && y < 0) || (x > 0 && y < 0)){
                    x *= -1;
                    y *= -1;
                }
                String key = x + "-" + y;
                slope.put(key, slope.getOrDefault(key,0)+1);
                maxP = Math.max(maxP,slope.get(key));
            }
            count = Math.max(count,(maxP + rep));
        }
        return count;
    }
    static int gcd(int a , int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}