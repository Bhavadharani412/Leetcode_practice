class Solution {
    public int maxArea(int[] height) {
        int len = height.length, left = 0, right = len - 1, area = Integer.MIN_VALUE;
        while(left < right)
        {
            int l = right - left;
            int b = Math.min(height[left], height[right]);
            area = Math.max(area, l * b);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return area;
    }
}