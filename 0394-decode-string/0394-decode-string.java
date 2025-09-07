class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<StringBuilder> stack =new Stack<>();
        StringBuilder current = new StringBuilder();
        int k=0;
        for(char c :s.toCharArray()){
            if(Character.isDigit(c)){
                k = k*10 + (c - '0');
            }
            else if(c == '['){
                stack.push(current);
                count.push(k);
                k=0;
                current = new StringBuilder();
            }
            else if(c == ']'){
                int mul =count.pop();
                StringBuilder decoded = stack.pop();
                for(int i=0;i<mul;i++){
                    decoded.append(current);
                }
                current =decoded;
                   
            
            }
            else{
                current.append(c);
            }
        }
        return current.toString();
    }
}