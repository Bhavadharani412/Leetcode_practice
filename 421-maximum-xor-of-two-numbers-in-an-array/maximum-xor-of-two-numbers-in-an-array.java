class Solution {
    public int findMaximumXOR(int[] nums) {
        int res = 0, mask = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 30; i >= 0; i--) {
            mask |= (1 << i);
            for (int value : nums) {
                set.add(value & mask);
            }
            int cur = res | (1 << i);
            for (int prefix : set) {
                if (set.contains(cur ^ prefix)) {
                    res = cur;
                    break;
                }
            }
            set.clear();
        }
        return res;
    }
}