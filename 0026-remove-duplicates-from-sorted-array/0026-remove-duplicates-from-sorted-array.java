class Solution {
    public int removeDuplicates(int[] nums) {
        // if( nums.length==0){
        //     return 0;
        // }
        // else {
        //     int i=0;
        //     for(int j=1;j<nums.length;j++){
        //         if(nums[j]!=nums[i]){
        //             i++;
        //             nums[i]=nums[j];
        //         }
        //     }
        //     return i+1;
            int i=0;
            int j=1;
            while(j<nums.length){
                if(nums[i]!=nums[j]){
                    i++;
                    nums[i] = nums[j];
                }
                j++;
            }
            return i+1;
        
    }
}