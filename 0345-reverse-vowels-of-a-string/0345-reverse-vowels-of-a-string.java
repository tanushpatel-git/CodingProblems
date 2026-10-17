class Solution {
    public String reverseVowels(String s) {
        int si = 0;
        int ei = s.length() - 1;
        char[] strs = s.toCharArray();
        
        while (si < ei) {
            while (si < ei && !isVowel(strs[si])) {
                si++;
            }
            while (si < ei && !isVowel(strs[ei])) {
                ei--;
            }
            
            char temp = strs[si];
            strs[si] = strs[ei];
            strs[ei] = temp;
            
            si++;
            ei--;
        }
        return new String(strs);
    }
    private boolean isVowel(char c) {
        char lower = Character.toLowerCase(c);
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }
}
