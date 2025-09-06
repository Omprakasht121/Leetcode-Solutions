class Solution {
    public long[] sumOfThree(long num) {
        long ans[] = new long[3];
        if((num-3)%3 == 0){
            long a =  (num-3)/3;
            ans[0] = a;
            ans[1] = a+1;
            ans[2] = a+2;
            return ans;
        }
        return new long[0];
    }
}