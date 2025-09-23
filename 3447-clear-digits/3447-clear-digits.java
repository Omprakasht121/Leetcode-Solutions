class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                stack.push(c);
            }
            else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        String ans="";
        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }
        return ans;
    }
}