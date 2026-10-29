class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int si = 0;
        int diff = 0;
        while (si < nums.length){
            diff = target - nums[si];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),si};
            }else{
                map.put(nums[si],si);
                si++;
            }
        }
        return new int[]{-1,-1};
    }
}