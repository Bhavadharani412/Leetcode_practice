class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length, max = 0;
        int[] pregcd = new int[n];
        for(int i = 0; i < n;i++){
            max = (max < nums[i]) ? nums[i] : max;
            pregcd[i] = gcd(nums[i], max);
        }
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : pregcd) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(freq.keySet());
        Collections.sort(list);
        int i = 0, j = list.size() - 1;
        long sum = 0;
        while (i <= j) {
            int left = list.get(i);
            int right = list.get(j);
            int countLeft = freq.get(left);
            int countRight = freq.get(right);
            if (i == j) {
                int pairs = countLeft / 2;
                sum += (long) pairs * gcd(left, right);
                break;
            }

            int pairs = Math.min(countLeft, countRight);
            sum += (long) pairs * gcd(left, right);
            freq.put(left, countLeft - pairs);
            freq.put(right, countRight - pairs);
            if (freq.get(left) == 0) i++;
            if (freq.get(right) == 0) j--;
        }
        return  sum;
    }
    public static int gcd(int a, int b) {
    return (b == 0) ? a : gcd(b, a % b);
}
}