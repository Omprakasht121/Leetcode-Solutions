class Solution {
    public int trailingZeroes(int n) {
        int zero = 0;
        int div = 5;
        while(n/div !=0){
           
            int x = n/div;
            zero += x;
            div = div*5;
            
        }
        return zero;
    }
}