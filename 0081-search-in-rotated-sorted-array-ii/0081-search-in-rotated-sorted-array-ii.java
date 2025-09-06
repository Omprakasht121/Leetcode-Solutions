class Solution {
    public boolean search(int[] nums, int target) {
        // int index = Arrays.binarySearch(nums,target);
        // if(index < 0) return false;
        // return true;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target) return true;
        }
        return false;
    }
}