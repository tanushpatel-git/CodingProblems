class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        while (left < right){
            if(height[left] < height[right]){
                if(leftMax > height[left]){
                    water += leftMax - height[left];
                }else{
                    leftMax = height[left];
                }
                left++;
            }else{
                if(rightMax > height[right]){
                    water += rightMax - height[right];
                }else{
                    rightMax = height[right];
                }
                right--;
            }
        }
        return water;
    }
}