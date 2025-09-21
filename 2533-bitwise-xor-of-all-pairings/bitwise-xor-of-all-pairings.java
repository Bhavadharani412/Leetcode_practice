class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int x = 0, y = 0;
        for(int i : nums1) x ^= i;
        for(int j : nums2) y ^= j;
        return (nums1.length % 2 * y) ^ (nums2.length % 2 * x);
    }
}