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
    public boolean mirrorcheck(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 ==null) return true;
        if(t1 ==null || t2 ==null ) return false;

        return (t1.val == t2.val)&&
        mirrorcheck(t1.left,t2.right)&&
        mirrorcheck(t1.right,t2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;

        return mirrorcheck(root.left, root.right);


        // Queue<TreeNode> q1 = new LinkedList<>();
        // Queue<TreeNode> q2 = new LinkedList<>();

        // q1.add(root.left);
        // q2.add(root.right);
        // while(!q1.isEmpty() && !q2.isEmpty()){
        //     TreeNode temp1 = q1.poll();
        //     TreeNode temp2 = q2.poll();
        //      if (temp1 == null && temp2 == null) continue;
        //     if (temp1 == null || temp2 == null) return false;
        //     if (temp1.val != temp2.val) return false;

        //     // mirror check
        //     q1.add(temp1.left);
        //     q2.add(temp2.right);

        //     q1.add(temp1.right);
        //     q2.add(temp2.left);
        // }
        // return q1.isEmpty() && q2.isEmpty();
    }
}