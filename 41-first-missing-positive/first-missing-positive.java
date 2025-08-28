class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }   
        int missingpositive = 1;
        while (missingpositive <= nums[n-1]){ 
			if (!map.containsKey(missingpositive))
            { return missingpositive; }
             missingpositive++;
        }
        return missingpositive;
    }
}
// }import java.util.* ;
// import java.io.*; 
// public class Solution {
// 	public static int firstMissing(int[] arr, int n) {	
// 		;	
// 	}
// }