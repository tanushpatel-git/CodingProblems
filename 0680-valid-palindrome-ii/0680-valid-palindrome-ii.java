class Solution {
    private boolean isPalindrom(String s,int si, int ei){
        while(si < ei){
            if(s.charAt(si) == s.charAt(ei)){
                si++;
                ei--;
            }else{
                return false;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int si = 0;
        int ei = s.length()-1;
        while (si < ei){
            if(s.charAt(si) == s.charAt(ei)){
                si++;
                ei--;
            }else{
                return isPalindrom(s,si,ei-1) || isPalindrom(s,si+1,ei);
            }
        }
        return true;
    }
}