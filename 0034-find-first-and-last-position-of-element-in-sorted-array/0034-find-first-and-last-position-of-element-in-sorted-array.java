class Solution {
    private int firstElementIndex(int[] nums, int target){
        int n = nums.length;
        int ans = n;
        int si = 0, ei = n-1;
        while(si<=ei){
            int mid = si + (ei- si)/2;
            if(target<=nums[mid]){
                ans = mid;
                ei = mid -1;
            }else{
                si = mid+1;
            }
        }
        return ans;
    }
    private int lastElementIndex(int[] nums, int target){
        int n = nums.length;
        int ans = n;
        int si = 0, ei = n-1;
        while(si<=ei){
            int mid = si + (ei- si)/2;
            if(target<nums[mid]){
                ans = mid;
                ei = mid -1;
            }else{
                si = mid+1;
            }
        }
        return ans-1;
    }
    public int[] searchRange(int[] nums, int target) {
        int firstElement = firstElementIndex(nums,target);
        int lastElement = lastElementIndex(nums,target);
        if(firstElement == nums.length || nums[firstElement] !=target) return new int[]{-1,-1};
        if(lastElement == nums.length || nums[lastElement] !=target) return new int[]{-1,-1};
        return new int[]{firstElement,lastElement};
    }
}