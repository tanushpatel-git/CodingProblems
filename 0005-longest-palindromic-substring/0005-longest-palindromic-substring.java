class Solution {
    // i have to optamise it also 
    public boolean checkPalindrom(String sub){
        int left = 0;
        int right = sub.length()-1;
        while (left < right){
            if (sub.charAt(left) == sub.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        if (s.length() == 1){
            return s;
        }else if(s.length() == 0 || s == null){
            return "";
        }
        String result = "";
        String subS = s.substring(0,0);
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                subS = s.substring(i,j);
                if(checkPalindrom(subS)){
                    if (result.length() < subS.length()){
                        result = subS;
                    }
                }
            }
        }
        return result;
    }
}