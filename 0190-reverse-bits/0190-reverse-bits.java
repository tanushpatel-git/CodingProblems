public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        
        for (int i = 0; i < 32; i++) {
            // 1. Extract the rightmost bit of n
            int bit = n & 1;
            
            // 2. Shift the bit to its reversed position (31 - i) and merge it
            result |= (bit << (31 - i));
            
            // 3. Perform an unsigned right shift to move the next bit into position
            n >>>= 1;
        }
        
        return result;
    }
}
