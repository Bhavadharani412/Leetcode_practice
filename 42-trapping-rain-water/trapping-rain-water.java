class Solution {
    public int trap(int[] height) {
        int width = 0, ml = 0, mr = 0, left = 0, right = height.length - 1;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] > ml) ml = height[left];
                width += ml - height[left++];
            }
            else{
                if(height[right] > mr)
                mr = height[right];
                width += mr - height[right--];
            }
        }
        return width;
    }
}