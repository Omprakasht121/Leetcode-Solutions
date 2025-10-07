class Solution {
    public String reverseWords(String s) {
        String str[] = s.split(" ");
        String ans ="";
        for(String s1 : str){
            String temp ="";
            for(int i=s1.length()-1;i>=0;i--){
                temp = temp + s1.charAt(i);
            }
            ans = ans + " " + temp;
        }
        return ans.strip();
    }
}