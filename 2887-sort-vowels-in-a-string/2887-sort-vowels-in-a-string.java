class Solution {
    public String sortVowels(String s) {
        ArrayList<Integer> vowel = new ArrayList<>();
        String ans = "";
        for(char c : s.toCharArray()){
            if("AEIOUaeiou".indexOf(c)>=0){
                vowel.add((int) c);
            }
        }
        Collections.sort(vowel);
        int i=0;
        for(char c : s.toCharArray()){
            if("AEIOUaeiou".indexOf(c)>=0){
                int a = vowel.get(i);
                ans += (char) a;
                i++;
            }
            else{
                ans += c;
            }
            
        }
        return ans;
    }
}