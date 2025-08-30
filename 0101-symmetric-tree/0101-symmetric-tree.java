/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        if(root.left == null && root.right == null) return true;
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        q1.add(root.left);
        q2.add(root.right);
        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode temp1 = q1.poll();
            TreeNode temp2 = q2.poll();
             if (temp1 == null && temp2 == null) continue;
            if (temp1 == null || temp2 == null) return false;
            if (temp1.val != temp2.val) return false;

            // mirror check
            q1.add(temp1.left);
            q2.add(temp2.right);

            q1.add(temp1.right);
            q2.add(temp2.left);
        }
        return q1.isEmpty() && q2.isEmpty();
    }
}