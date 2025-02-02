package binary_tree;

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
