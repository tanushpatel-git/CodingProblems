class Solution {
    public int primePalindrome(int n) {

        if (8 <= n && n <= 11) return 11;
        
        for (int i = 1; i < 100000; i++) {
            int palindrome = createPalindrome(i);
            if (palindrome >= n && isPrime(palindrome)) {
                return palindrome;
            }
        }
        
        return -1;
    }

    private int createPalindrome(int root) {
        int palindrome = root;
        int temp = root / 10;
        while (temp > 0) {
            palindrome = palindrome * 10 + (temp % 10);
            temp /= 10;
        }
        return palindrome;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        
        int sqrt = (int) Math.sqrt(num);
        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
