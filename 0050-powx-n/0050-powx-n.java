class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            N = -N;
        }
        
        double ans = 1.0;
        double currentProduct = x;
        
        while (N > 0) {
            if (N % 2 == 1) {
                ans *= currentProduct;
            }
            currentProduct *= currentProduct;
            N /= 2;
        }
        
        if (n < 0) {
            return 1.0 / ans;
        }
        return ans;
    }
}
