class Solution {
    public int maxArea(int[] height) {
        int waterFill = Integer.MIN_VALUE;
        int si = 0, ei = height.length-1;
        int areaTemp = 0;
        while (si < ei){
            if(height[si] < height[ei]){
                areaTemp = height[si] * (ei-si);
                si++;
            }else{
                areaTemp = height[ei] * (ei - si);
                ei--;
            }
            waterFill = Math.max(waterFill,areaTemp);
        }
        return waterFill;
    }
}