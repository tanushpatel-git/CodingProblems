class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int si = 0, ei = 0, n = s.length();
        int logeString = Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();
        while (ei < n) {
            while (set.contains(s.charAt(ei))) {
                set.remove(s.charAt(si));
                si++;
            }
            set.add(s.charAt(ei));
            ei++;
            logeString = Math.max(logeString,ei-si);
        }
        return logeString;
    }
}