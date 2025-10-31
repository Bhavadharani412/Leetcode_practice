class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] a=new int[2];
        int j=0;
        Map<Integer,Integer> m = new HashMap<>();
        for (int number:nums) {
            m.put(number,m.getOrDefault(number,0)+1);
            if (m.get(number) == 2) {
                if(j < 2){
                    a[j++] = number;
                }
            }
        }
        return a;
    }
}