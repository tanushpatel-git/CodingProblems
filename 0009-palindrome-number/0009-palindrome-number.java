class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String str_x = Integer.toString(x);
        int ei = str_x.length()-1;
        for (int i = 0;i< str_x.length()/2;i++){
            if(str_x.charAt(i) == str_x.charAt(ei)){
                ei--;
            }else{
                return false;
            }
        }
        return true;
    }
}