class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int counter = 0;
        for(int i = 0;i<n;i++){
            int[] freq = new int[26];
            for(int j = i;j<n;j++){
                freq[s.charAt(j) - 'a']++;
                counter += getBeuty(freq);
            }
        }
        return counter;
    }
    private static int getBeuty(int[] freq){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int count : freq){
            if (count > 0){
                max = Math.max(max, count);
                min = Math.min(min, count); 
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max - min;
    }
}