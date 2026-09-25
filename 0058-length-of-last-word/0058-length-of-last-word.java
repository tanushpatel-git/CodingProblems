class Solution {
    public int lengthOfLastWord(String s) {
        int i = 0, j = s.length()-1, count = 0;
        if (s == null || s.length() == 0) return 0;
        while(true){
            if(s.charAt(j) == ' '){
                j--;
            }else{
                break;
            }
        }
        i = j;
        while(i >= 0){
            if(s.charAt(i) != ' '){
                i--;
            }else{
                break;
            }
        }
        return j-i;
    }
}