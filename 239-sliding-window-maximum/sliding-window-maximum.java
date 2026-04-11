class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i < k; i++){
            while(dq.isEmpty() == false && (nums[i] >nums[dq.getLast()])){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        res[0] = nums[dq.getFirst()];
        int wb = 1, we = k, li = 0, i = 1;
        while(we < n){ 
             // remove leaving index from dq
            if(dq.isEmpty() == false && dq.getFirst() == li){ 
                dq.removeFirst();
            }
            // removing elements that don't contribute
            while(dq.isEmpty() == false && (nums[we] > nums[dq.getLast()])){
                dq.removeLast();
            }
            // added current value 
            dq.addLast(we);
            res[i] = nums[dq.getFirst()];
            li = wb;
            we++;
            wb++;
            i++;
        }
       return res;    
    }
}