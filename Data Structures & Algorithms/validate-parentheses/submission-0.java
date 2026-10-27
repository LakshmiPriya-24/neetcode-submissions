class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // If it's an opening bracket, push it to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If it's a closing bracket, check if it matches the top of the stack
            else {
                // If stack is empty or brackets don't match, return false
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                
                // Check for valid matching pairs
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }
        // If the stack is empty, all brackets are matched; otherwise return false
        return stack.isEmpty();
        
    }
}
