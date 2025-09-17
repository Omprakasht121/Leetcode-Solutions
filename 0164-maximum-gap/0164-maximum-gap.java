class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        Arrays.sort(nums);
        int max=0;
        for(int i =1;i<nums.length;i++){
            int x = Math.abs(nums[i-1]-nums[i]);
            max = Math.max(max,x);
        }
        return max;
    }
}