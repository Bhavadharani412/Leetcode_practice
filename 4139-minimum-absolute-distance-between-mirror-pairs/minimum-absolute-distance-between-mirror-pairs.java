class Solution {
    private int reverseInt(int x) {
        int rev = 0;
        for (; x > 0; rev = rev * 10 + (x % 10), x /= 10);
        return rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> li = new HashMap<>();
        int mindis = Integer.MAX_VALUE;
        for (int j = 0; j < nums.length; j++) {
            int val = nums[j];
            if (li.containsKey(val)) {
                int i = li.get(val);
                mindis = Math.min(mindis, j - i);
            }
            int rev = reverseInt(val);
            li.put(rev, j);
        }
        return mindis == Integer.MAX_VALUE ? -1 : mindis;
    }
}