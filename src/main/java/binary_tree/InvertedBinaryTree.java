package binary_tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

/**
 * LeetCode Problem #226: Inverted Binary Tree.
 * Link: <a href="https://leetcode.com/problems/invert-binary-tree/">...</a>
 */
class InvertedBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        dfs(root);

        return root;
    }

    void dfs(TreeNode node) {
        if (node.left != null)
            dfs(node.left);
        if (node.right != null)
            dfs(node.right);

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
