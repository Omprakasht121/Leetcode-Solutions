class Solution {
    public int countCharacters(String[] words, String chars) {
        int count =0;
        for(String word :words){
            String temp = chars;
            boolean flag = false;
            for(char ch : word.toCharArray()){
                if(temp.contains(String.valueOf(ch))){
                    int index = temp.indexOf(ch);
                    flag = true;
                    temp = temp.substring(0,index) + temp.substring(index+1);
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                count  = count + word.length();
            }
        }
        return count;
    }
}