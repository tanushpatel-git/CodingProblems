class Solution {
    public int lengthOfLongestSubstring(String s) {
        int si = 0;
        int ei = 0;
        HashSet<Character> set = new HashSet<>();
        int logestString = Integer.MIN_VALUE;
        if (s == null || s.length() == 0) return 0;
        while (ei < s.length()){
            while(set.contains(s.charAt(ei))){
                set.remove(s.charAt(si));
                si++;
            }
            set.add(s.charAt(ei++));
            logestString = Math.max(logestString,ei-si);
        }
        return logestString;
    }
}