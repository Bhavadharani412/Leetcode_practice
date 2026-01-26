class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
       Arrays.sort(arr);
       int min = Math.abs(arr[1] - arr[0]);
       for(int i=1;i<arr.length-1;i++)
            min = Math.min(min, arr[i+1] - arr[i]);
        List<List<Integer>> res=new ArrayList<>(); 
        for(int i = 1;i < arr.length;i++)
            if(arr[i] - arr[i-1] == min)
                   res.add(Arrays.asList(arr[i-1],arr[i]));
        return res;
    }
}