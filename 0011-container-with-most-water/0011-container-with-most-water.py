class Solution:
    def maxArea(self, height: List[int]) -> int:
        si = 0
        ei = len(height)-1
        areaTemp = 0
        maxArea = 0
        while si < ei:
            if height[si] < height[ei]:
                areaTemp = height[si] * (ei-si)
                si+=1
            else:
                areaTemp = height[ei] * (ei-si)
                ei-=1
            if areaTemp >= maxArea:
                maxArea = areaTemp
        return maxArea