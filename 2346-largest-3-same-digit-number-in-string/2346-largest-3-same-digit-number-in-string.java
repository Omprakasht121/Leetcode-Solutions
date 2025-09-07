class Solution {
    public String largestGoodInteger(String num) {
        int left =0;
        int right =2;
        int a =-1;
        while(right<num.length()){
            String sb= num.substring(left,right+1);
            int b = Integer.parseInt(sb);
            if(b>=a){
                boolean flag = true;
                for(char c : sb.toCharArray()){
                    if(c!=sb.charAt(0)) {
                        flag =false;
                        break;
                    }
                }
                if(flag==true) a=b;
            }
            left++;
            right++;
        }
        if(a>0) return Integer.toString(a);
        if(a==0) return "000";
        return "";
        
    }
}