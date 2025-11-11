class Solution {
    public boolean isValid(String word) {
        int count =0;
        int vowel =0;
        int consto =0;
        for(char c : word.toCharArray()){
            if(!Character.isDigit(c) && !Character.isLetter(c)) return false;
            count++;
            if(Character.isLetter(c)){
                
                if("AEIOUaeiou".indexOf(String.valueOf(c)) >= 0) vowel++;
                else consto++;
            }
        }
        if(count >=3 && (vowel >=1  && consto >= 1)) return true;
        return false;

    }
}