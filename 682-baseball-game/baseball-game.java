class Solution {
    public int calPoints(String[] o) {
        int sum=0,k =-1,len=o.length;
        int[] nums=new int[len];
        for(String s:o){
            if(s.equals("C")){
                sum-=nums[k--];
                continue;
            }else if(s.equals("D")){
                nums[k+1]=2*nums[k];
                sum+=nums[++k];
                continue;
            }else if(s.equals("+")){
                nums[k+1]=nums[k-1]+
                    nums[k];
                sum+=nums[++k];
                continue;
            }
            nums[++k]=
                Integer.valueOf(s);
            sum+=nums[k];
        }
        return sum;
    }
}