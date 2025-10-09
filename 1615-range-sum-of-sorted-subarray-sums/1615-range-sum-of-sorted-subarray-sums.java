class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            int sum =0;
            for(int j = i;j<nums.length;j++){
                sum = sum+nums[j];
                list.add(sum);
            }
        }
        Collections.sort(list);
        long sum =0;
        long mod = 1000000007;
        while(left<=right){
            sum = (sum +  list.get(left-1)) % mod;
            left++;
        }
        return (int)sum;
    }
}