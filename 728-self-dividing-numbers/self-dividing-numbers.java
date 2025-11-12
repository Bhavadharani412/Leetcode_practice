class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       List<Integer> r = new ArrayList<>();
       for(int i = left; i <= right;i++){
        int temp = i;
        boolean f1 = true;
        while(temp != 0){
            int rem = temp%10;
            if(rem == 0 || i % rem != 0){
                f1 = false;
                temp = 0;
            }
            temp /= 10;
        }
        if(f1) r.add(i);
       }
       return r; 
    }
}