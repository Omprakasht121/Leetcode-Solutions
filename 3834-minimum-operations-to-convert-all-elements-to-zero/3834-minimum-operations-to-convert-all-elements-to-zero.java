class Solution {
    public int minOperations(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int ops = 0;

        for (int x : nums) {
            // pop all values greater than x — each popped distinct value => one operation
            while (!stack.isEmpty() && stack.peekLast() > x) {
                stack.removeLast();
                ops++;
            }

            // if x > 0 and either stack empty or top < x, push x (start new plateau)
            if (x > 0) {
                if (stack.isEmpty() || stack.peekLast() < x) {
                    stack.addLast(x);
                }
                // if top == x, do nothing (same plateau)
            }
            // if x == 0, we don't push — zero acts as a barrier
        }

        // remaining values on the stack each need one operation
        while (!stack.isEmpty()) {
            stack.removeLast();
            ops++;
        }

        return ops;
    }
}