class Solution {
    public int strStr(String haystack, String needle){
        if(haystack.length() < needle.length()) return -1;
        if((haystack.length() == 0 && haystack == null) || (needle.length() == 0 && needle == null)) return -1;
        int si = 0;
        int push = -1;
        int secondSi = 0;
        while (si < haystack.length() && secondSi < needle.length() ){
            if(haystack.charAt(si) == needle.charAt(secondSi)){
                if(secondSi == 0){
                    push = si;
                }
                si++;
                secondSi++;
            }else{
                if(secondSi > 0){
                    si = push + 1;
                    secondSi = 0;
                    push = -1;
                }else{
                    si++;
                }
            }
        }
        if(secondSi == needle.length()){
            return push;
        }
        return -1;

    }
}