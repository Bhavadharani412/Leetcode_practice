class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int left = 0, right = 0;
        if (nums1[nums1.length-1] < nums2[0] || nums2[nums2.length-1] < nums1[0]) return -1;
        while(left < len1 && right < len2)
        {
            if(nums1[left] == nums2[right]) return nums1[left];
            else{
                if(nums1[left] < nums2[right]) left++;
                else right++;
            }
        }
        return -1;
    }
}