class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int j=0;
        for(int i=0;i<n/2 && j<n;i++){
            arr[j] = i+1;
            j++;
            arr[j] = -(i+1);
            j++;  
        }
        if(n%2!=0) arr[j] =0;
        return arr;
    }
}