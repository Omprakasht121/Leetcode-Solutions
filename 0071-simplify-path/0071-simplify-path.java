class Solution {
    public String simplifyPath(String path) {
        String str[] = path.split("/");
        Stack<String> stack = new Stack<>();
        String ans ="";
        for( String s :str){
            if(s.equals("") || s.equals(".")){
                continue;
            }
            else if(s.equals("..")){
                if(!stack.isEmpty())stack.pop();
                
            }
            else stack.push(s);
        }
        while(!stack.isEmpty()){
            ans = "/"+stack.pop()+ans;
        }
        if(ans.equals("")) return "/";
        return ans;
    }
}