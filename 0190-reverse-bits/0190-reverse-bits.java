class Solution {
    public int reverseBits(int n) {
        String s = "";
        int count=0;
        while(n!=0){
            int bit = n%2;
            s = String.valueOf(bit) + s;
            n = n/2;
            count++;
        }
        while(count<32){
            s = '0' + s;
            count++;
        }
       
        int num=0;
        for(int i=0;i<s.length();i++){
            int bit = s.charAt(i)-'0';
            
            int x = bit *(int) Math.pow(2,i);
            num = num+x;
            
        }
        return num;
    
    }
}