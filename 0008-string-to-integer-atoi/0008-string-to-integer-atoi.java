class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int i = 0;
        int n = s.length();
        
        // 1. Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        // If string is only spaces
        if (i == n) {
            return 0;
        }
        
        // 2. Check for optional '+' or '-' sign
        int sign = 1;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        
        int result = 0;
        int threshold = Integer.MAX_VALUE / 10;
        
        // 3. Read sequential digits and handle overflow
        while (i < n) {
            char c = s.charAt(i);
            
            // Stop if non-digit character is encountered
            if (c < '0' || c > '9') {
                break;
            }
            
            int digit = c - '0';
            
            // 4. Preemptive overflow check
            if (result > threshold || (result == threshold && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            i++;
        }
        
        return result * sign;
    }
}
