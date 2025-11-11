class Solution {
    public int minOperations(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int ops = 0;

        for (int x : nums) {

            // Zero acts as a hard barrier (cannot include in subarray)
            if (x == 0) {
                while (!stack.isEmpty()) {
                    stack.removeLast();
                    ops++;
                }
                continue;
            }

            // Pop all values greater than current (they finish forming segments)
            while (!stack.isEmpty() && stack.peekLast() > x) {
                stack.removeLast();
                ops++;
            }

            // Push if it starts a new plateau
            if (stack.isEmpty() || stack.peekLast() < x) {
                stack.addLast(x);
            }
        }

        // Remaining values each need one operation
        while (!stack.isEmpty()) {
            stack.removeLast();
            ops++;
        }

        return ops;
    }
}