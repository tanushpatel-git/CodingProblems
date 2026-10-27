class Solution {
    public String reverseStr(String s, int k) {
        if (s == null || s.length() <= 1) return s;
        
        char[] ch = s.toCharArray();
        int n = ch.length;
        
        for (int start = 0; start < n; start += 2 * k) {
            int left = start;
            int right = Math.min(start + k - 1, n - 1);
            
            while (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(ch);
    }
}
