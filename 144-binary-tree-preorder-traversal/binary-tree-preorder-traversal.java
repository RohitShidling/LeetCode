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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        BFS(root, lst);
        return lst;
    }

    private void BFS(TreeNode root, List<Integer> result) {
        if (root == null)
            return;

        result.add(root.val);
        BFS(root.left,result);
        BFS(root.right,result);
    }
}
