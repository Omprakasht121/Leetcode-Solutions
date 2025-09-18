class Solution {
    public int countHillValley(int[] nums) {
       List<Integer> list = new ArrayList<>();
        list.add(nums[0]); // always include the first element

        // Skip only consecutive duplicates
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                list.add(nums[i]);
            }
        }

        int count = 0;
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i - 1) < list.get(i) && list.get(i) > list.get(i + 1)) {
                count++; // hill
            } else if (list.get(i - 1) > list.get(i) && list.get(i) < list.get(i + 1)) {
                count++; // valley
            }
        }

        return count;
    }
}