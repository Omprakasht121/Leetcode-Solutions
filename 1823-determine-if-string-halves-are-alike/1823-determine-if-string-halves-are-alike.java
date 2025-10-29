class Solution {
    public boolean halvesAreAlike(String s) {
        if(s.length()%2 != 0) return false;
        int n = s.length();
        String sb1 = s.substring(0,n/2);
        String sb2 = s.substring(n/2);
        int count1 =0;
        int count2 =0;
        for(int i=0;i<sb1.length();i++){
            char ch1 = sb1.charAt(i);
            char ch2 = sb2.charAt(i);
            if("aeiouAEIOU".contains(String.valueOf(ch1))) count1++;
            if("aeiouAEIOU".contains(String.valueOf(ch2))) count2++;
        }
        if(count1 == count2) return true;
        return false;

    }
}