class Solution {
    public static String leftShift(String str) {
        int k = 1;
        if (str == null || str.isEmpty()) {
            return str;
        }

        int len = str.length();
        k = k % len;

        return str.substring(k) + str.substring(0, k);
    }

    public boolean rotateString(String s, String goal) {
        String newString = s;
        for(int i = 0;i<s.length();i++){
            newString = leftShift(newString);
            if(goal.equals(newString)){
                return true;
            }
        }
        return false;
    }
}