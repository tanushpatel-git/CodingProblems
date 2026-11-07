class Solution {
    public int singleNumber(int[] nums) {
        int tows = 0;
        int one = 0;
        for(int num : nums){
            one = (one ^ num) & ~tows;
            tows = (tows ^ num) & ~one;
        }
        return one;
    }
}