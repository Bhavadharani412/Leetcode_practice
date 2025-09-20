class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>(); 
        int sum = 0;
        for(int i : nums)
          count.put(i, count.getOrDefault(i, 0) + 1);
       for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) { 
                sum += entry.getKey();
            }
        }
        return sum;
    }
}