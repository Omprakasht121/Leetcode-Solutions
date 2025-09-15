class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count =0;
        String arr[] = text.split(" ");
        for(String str : arr){
            boolean flag = false;
            for(int i=0;i<brokenLetters.length();i++){
                char c = brokenLetters.charAt(i);
                if(str.contains(String.valueOf(c))){
                    flag =true;
                    break;
                }
            }
            if(flag == false) count++;
        }
        return count;
    }
}