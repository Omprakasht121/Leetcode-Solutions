class Solution {
    public int[] getNoZeroIntegers(int n) {
        int ans[] = new int[2];
        int i=1;
        while(i<n){
            int a = i;
            int b = n-a;
            String digit1 = String.valueOf(a);
            String digit2 = String.valueOf(b);
            if(!digit1.contains(String.valueOf('0')) && !digit2.contains(String.valueOf('0'))){
                ans[0] = a;
                ans[1] = b;
                break;
            }
            i++;
        }
        return ans;
    }
}