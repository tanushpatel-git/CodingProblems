class Solution {
    // Map digits to their corresponding letters
    private static final String[] MAPPING = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        // Handle empty input edge case
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        backtrack(result, digits, 0, new StringBuilder());
        return result;
    }

    private void backtrack(List<String> result, String digits, int index, StringBuilder current) {
        // If the current combination is the same length as digits, add it to results
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get letters for the current digit
        char digitChar = digits.charAt(index);
        String letters = MAPPING[digitChar - '0'];

        // Loop through each letter, add it, and move to the next digit
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backtrack(result, digits, index + 1, current);
            // Remove the last letter to backtrack for the next loop
            current.deleteCharAt(current.length() - 1);
        }
    }
}
