class Solution {
    public int minLength(String s) {
        
        while(s.contains("AB") || s.contains("CD")){
            int index1 = s.indexOf("AB");
            
            if(index1 != -1){
                s = s.substring(0,index1)+s.substring(index1+2);
            }
            int index2 = s.indexOf("CD");
            if(index2 != -1){
                s = s.substring(0,index2)+s.substring(index2+2);
            }
        }
        return s.length();
    }
}