class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String dou = s + s;
        String sb = dou.substring(1,dou.length()-1);
        return sb.contains(s);
    }
}