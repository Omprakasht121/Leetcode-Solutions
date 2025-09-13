class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> vowel = new HashMap<>();
        Map<Character, Integer> consonant = new HashMap<>();
        int vowmax =0;
        int conmax =0;
        for(char c : s.toCharArray()){
            if("AEIOUaeiou".indexOf(c) != -1){
                vowel.put(c,vowel.getOrDefault(c,0)+1);
                int a = vowel.get(c);
                vowmax = Math.max(vowmax,a);
            }
            else{
                consonant.put(c,consonant.getOrDefault(c,0)+1);
                int a = consonant.get(c);
                conmax = Math.max(conmax,a);
            }
        }
        return vowmax+conmax;
    }
}