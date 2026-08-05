class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int si = 0;
        int diffrence = 0;
        while (si < nums.length){
            diffrence = target - nums[si];
            if (map.containsKey(diffrence)){
                return new int[]{map.get(diffrence),si};
            }else{
                map.put(nums[si],si);
            }
            si++;
        }
        return new int[]{0,0};

    }
}