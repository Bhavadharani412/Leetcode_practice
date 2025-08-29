class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = nums[0];
        for(int i = 1;i < n; i++){
            pre[i] = pre[i-1] + nums[i];
        }
        HashMap<Integer,Integer> freq = new HashMap<>();
        int count = 0;
        for(int j = 0; j < n;j++){
            if(pre[j] == k) count++;

            int val = pre[j] - k;
            if(freq.containsKey(val)){
                count += freq.get(val);
            }
            if (freq.containsKey(pre[j])) {
                freq.put(pre[j], freq.get(pre[j]) + 1);
            } 
            else {
                freq.put(pre[j], 1);
            }
        }
        return count;
    }
}