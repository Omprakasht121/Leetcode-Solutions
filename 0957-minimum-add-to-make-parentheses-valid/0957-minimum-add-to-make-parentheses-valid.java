class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }
            else if(!stack.isEmpty()){
                stack.pop();
            }
            else count++;
        }
        while(!stack.isEmpty()){
            stack.pop();
            count++;
        }
        return count;
    }
}