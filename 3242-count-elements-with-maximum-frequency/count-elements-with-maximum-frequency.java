class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> countmap = new HashMap<>();
        for(int i : nums){
            countmap.put(i,countmap.getOrDefault(i,0)+1);
        }
        int max = 0, sum = 0, count = 1, ans = 0;
        for(int key : countmap.keySet()){
          max = Math.max(max, countmap.get(key));
        }
        for(int key : countmap.keySet()){
            if(max == countmap.get(key))
            ans += max;
        }
        return ans;
    }
}