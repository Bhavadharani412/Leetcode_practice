class Solution {
    public int minOperations(int[][] grid, int x) {
      int total=0;
      for(int[] num: grid){
        total+=num.length;
      }  
      int[] arr=new int[total];
      int p=0;
      for(int[] num:grid){
        for(int number:num){
            arr[p]=number;
            ++p;
        }
      }
      Arrays.sort(arr);
      int median=arr[total/2], sum=0;
      if((arr[total-1]-arr[0])%x!=0) return -1;
      for(int i=0;i<arr.length;i++){
        int diff=Math.abs((arr[i]-median));
        if(diff%x!=0) return -1;
        sum+=diff/x;
      }
      return sum;
    }
}