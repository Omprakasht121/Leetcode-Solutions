class Solution {
    public int countSubstrings(String s) {
        int count =0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sb = s.substring(i,j);
                if(sb.length() == 1) count++;
                else if(helper(sb)) count++;
            }
        }
        return count;
    }
    public boolean helper(String sb){
        int left =0;
        int right = sb.length()-1;
        while(left<right){
            if(sb.charAt(left) != sb.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}