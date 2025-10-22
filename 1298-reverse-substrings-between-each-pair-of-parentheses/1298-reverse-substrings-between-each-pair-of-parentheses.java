class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c != ')'){
                stack.push(c);
            }
            else{
                StringBuilder sb = new StringBuilder();

                while(!stack.isEmpty() && stack.peek() != '('){
                    sb.append(stack.pop());
                }
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                
                for(char ch : sb.toString().toCharArray()){
                    stack.push(ch);
                }
            }
            
        }
        StringBuilder result = new StringBuilder();
            for (char c : stack) {
            result.append(c);
        }
            return result.toString();
    }
}