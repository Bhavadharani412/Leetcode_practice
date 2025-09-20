class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        for(int i : nums){
            int temp = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
            set.add(temp);
        }
        return set.size();
    }
}