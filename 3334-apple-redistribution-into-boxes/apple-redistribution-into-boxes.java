class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total1 = 0, count = 0,total2 = 0;
        for(int i : apple) total1 += i;
        Arrays.sort(capacity);
        for(int i = capacity.length - 1; i >= 0;i--){
            total2 += capacity[i];
            count++;
            if(total2 >= total1) break;
        }
        return count;
    }
}