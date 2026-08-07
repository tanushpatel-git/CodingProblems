class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char ch;
        int i = 0;
        while (i < s.length()){
            ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                char pop = stack.pop();
                if((pop != '(' && ch == ')') || (pop != '[' && ch == ']') || (pop != '{' && ch == '}')){
                    return false;
                }
            }
            i++;
        }
        return stack.isEmpty();
    }
}