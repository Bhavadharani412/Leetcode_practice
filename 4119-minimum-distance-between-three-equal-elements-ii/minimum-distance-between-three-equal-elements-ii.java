class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, Deque<Integer>> map = new HashMap<>();
        int min_d = Integer.MAX_VALUE;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            map.putIfAbsent(v, new ArrayDeque<>());
            Deque<Integer> dq = map.get(v);
            dq.addLast(i);  
            if (dq.size() == 3) {
                int f = dq.peekFirst();
                int l = dq.peekLast();
                int dis = 2 * (l - f);
                min_d = Math.min(min_d, dis);
                flag = true;
                dq.pollFirst(); 
            }
        }
        return flag ? min_d : -1;
    }
}