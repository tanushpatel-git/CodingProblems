class Solution {
    public int beautySum(String s) {
        int totalBeuty = 0;
        for (int j = 0; j < s.length(); j++) {
            int[] freq = new int[26];
            for (int i = j; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
                totalBeuty += getBeuty(freq);
            }
        }
        return totalBeuty;
    }

    public static int getBeuty(int[] freq) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int count : freq) {
            if (count > 0) {
                min = Math.min(min, count);
                max = Math.max(max, count);
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max - min;
    }
}