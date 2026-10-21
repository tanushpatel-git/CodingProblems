class Solution {
    public int trap(int[] height) {
        int si = 0;
        int ei = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        while(si < ei){
            if(height[si] < height[ei]){
                if(leftMax > height[si]){
                    water += leftMax - height[si];
                }else{
                    leftMax = height[si];
                }
                si++;
            }else{
                if(rightMax > height[ei]){
                    water += rightMax - height[ei];
                }else{
                    rightMax = height[ei];
                }
                ei--;
            }
        }
        return water;
    }
}