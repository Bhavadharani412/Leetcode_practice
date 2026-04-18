class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        for (int bit = 0; bit < 32; bit++) {
            int zero = 0, one = 0;

            for (int x : nums) {
                if ((x & (1 << bit)) == 0) zero++;
                else one++;
            }

            int zeroIndex, oneIndex;

            if (bit == 31) { // sign bit
                oneIndex = 0;       // negatives first
                zeroIndex = one;
            } else {
                zeroIndex = 0;
                oneIndex = zero;
            }

            for (int x : nums) {
                if ((x & (1 << bit)) == 0)
                    output[zeroIndex++] = x;
                else
                    output[oneIndex++] = x;
            }

            System.arraycopy(output, 0, nums, 0, n);
        }

        return nums;
    }
}