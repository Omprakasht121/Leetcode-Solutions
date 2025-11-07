class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] count = new int[1001];  // values are <= 1000 based on constraints

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                count[nums[i + 1]]++;
            }
        }

        int maxCount = 0;
        int result = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                result = i;
            }
        }

        return result;
    }
}