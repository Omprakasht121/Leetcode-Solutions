class Solution {
    public boolean doesAliceWin(String s) {
       Set<Integer> paritySet = new HashSet<>();
        int count = 0; // current number of vowels modulo 2
        paritySet.add(0); // prefix sum starts at 0
        
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count = 1 - count; // flip parity when a vowel is found
            }
            paritySet.add(count);
        }
        
       
        return paritySet.size() > 1;
    }
}