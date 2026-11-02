class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int numsI = m;
        for (int i = 0; i < nums2.length; i++) {
            nums1[numsI] = nums2[i];
            numsI++;
        }
        Arrays.sort(nums1);
    }
}