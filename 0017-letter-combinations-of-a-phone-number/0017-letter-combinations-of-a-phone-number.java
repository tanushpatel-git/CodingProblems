import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        String[] mapping = {
            "", "", "abc", "def", "ghi", 
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        
        result.add("");
        
        for (int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            String letters = mapping[digit];
            List<String> nextList = new ArrayList<>();
            
            for (String prefix : result) {
                for (char c : letters.toCharArray()) {
                    nextList.add(prefix + c);
                }
            }
            result = nextList;
        }
        
        return result;
    }
}
