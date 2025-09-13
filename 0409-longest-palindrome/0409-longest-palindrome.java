class Solution {
    public int longestPalindrome(String s) {
       Map<Character, Integer> map = new HashMap<>();
       for(char c : s.toCharArray()){
        map.put(c, map.getOrDefault(c, 0)+1);
       }
       int length =0;
       boolean flag = false;
       for(int a : map.values()){
        length += (a/2)*2;
        
        if(a%2 == 1){
            flag = true;
        }
       }
       if(flag){
        length+=1;
       }
       return length;
       
    }
}