package binary_tree;

/**
 * LeetCode Problem #104: Maximum Depth Of Binary Tree.
 * Link: <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">...</a>
 */
public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepthCount(root.left);
        int right = maxDepthCount(root.right);

        return 1 + Math.max(left, right);
    }

    private int maxDepthCount(TreeNode root) {
        return dfs(root);
    }

    private int dfs(TreeNode node) {
        if (node == null)
            return 0;

        int left = dfs(node.left);
        int right = dfs(node.right);

        return 1 + Math.max(left, right);
    }
}
