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
    private int preIndex = 0;
    private Map<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Build value -> index map for inorder traversal
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int inLeft, int inRight) {
        // Base case
        if (inLeft > inRight) {
            return null;
        }

        // Pick current root from preorder
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        // Find root index in inorder
        int rootIndex = inorderMap.get(rootVal);

        // Build left and right subtrees
        root.left = build(preorder, inLeft, rootIndex - 1);
        root.right = build(preorder, rootIndex + 1, inRight);

        return root;
    }

    // Optional: Inorder print to verify correctness
    public static void printInorder(TreeNode root) {
        if (root == null)
            return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
}