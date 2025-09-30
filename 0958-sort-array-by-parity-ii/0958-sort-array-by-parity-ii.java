class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ans[] = new int[nums.length];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int num : nums){
            if(num%2 == 0){
                even.add(num);
            }
            else odd.add(num);
        }
        int e =0;
        int o=0;
        for(int i=0;i<ans.length;i++){
            if(i % 2 ==0){
                ans[i] = even.get(e);
                e++;
            }
            else {
                ans[i] = odd.get(o);
                o++;
            }
        }
        return ans;
    }
}