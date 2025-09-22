class Solution {
    public String makeGood(String s) {
        if(s.length() == 0) return s;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }
            else{
                if(stack.peek() != c && Character.toLowerCase(stack.peek()) == Character.toLowerCase(c)){
                    stack.pop();
                }
                else{
                    stack.push(c);
                }
            }
        }
        String ans = "";
        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }
        return ans;
    }
}