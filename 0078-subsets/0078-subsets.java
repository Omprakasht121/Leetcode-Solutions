class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // List<List<Integer>> result = new ArrayList<>();
        // result.add(new ArrayList<>()); // start with empty subset
        
        // for (int num : nums) {
        //     int size = result.size();
        //     for (int i = 0; i < size; i++) {
        //         List<Integer> newSubset = new ArrayList<>(result.get(i));
        //         newSubset.add(num);
        //         result.add(newSubset);
        //     }
        // }
        // return result;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0,new ArrayList<>(), result);
        return result;
    }
    public void backtrack(int[] nums, int start, ArrayList<Integer> temp,List<List<Integer>> result){
        result.add(new ArrayList<>(temp));

        for(int i =start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(nums, i+1,temp,result);
            temp.remove(temp.size()-1);
        }
    }
}