class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int num : nums1) {
            list1.add(num);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int num : nums2) {
            list2.add(num);
        }
        ArrayList<Integer> ans = new ArrayList<>();

        for (int num : list1) {
            if (list2.contains(num)) {
                ans.add(num);
                list2.remove(Integer.valueOf(num)); // ✅ fix here
            }
        }
        int[] result = new int[ans.size()];
        int i = 0;
        for (int num : ans) {
            result[i++] = num;
        }
        return result;
    }
}
