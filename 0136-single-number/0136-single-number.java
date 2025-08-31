class Solution {
    public int singleNumber(int[] nums) {

        int xor = 0;

        for(int i =0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        return xor;

        // ArrayList <Integer> list = new ArrayList<>();
        // for(int num: nums){
        //     list.add(num);
        // }
        // int b=-1;
        // for(int i=0; i<list.size();i++){
        //     int a=list.get(i);
        //     list.remove(i);
        //     if(list.contains(a)){
        //         list.add(i,a);
        //     }
        //     else {
        //         b=a;
        //         break;
        //     }
        // }
        // return b;
    }
}