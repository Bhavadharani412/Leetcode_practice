class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        for(int i : nums){
            int temp = i;
            String res = "";
            while(temp > 0){
                res += temp % 10;
                temp /= 10;
            }
            int n = Integer.valueOf(res);
            if(!set.contains(n)){
                set.add(n);
            }
        }
        return set.size();
    }
}