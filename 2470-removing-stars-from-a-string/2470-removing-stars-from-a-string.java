                                                                                         class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != '*'){
                stack.push(c);
            }
            else{
                stack.pop();
            }
        }
        String ans ="";
        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }
        return ans;
    }
}