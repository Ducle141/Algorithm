public int diameterOfBinaryTree(TreeNode root) {
    if (root == null) {
        return 0;
    }
    int lheight = height(root.left);
    int rheight = height(root.right);
    int ldiameter = diameterOfBinaryTree(root.left);
    int rdiameter = diameterOfBinaryTree(root.right);
    int res = Math.max(lheight + rheight, Math.max(ldiameter, rdiameter));
    return res;
}
private int height(TreeNode node) {
    if (node == null) return 0;
    int leftHeight = height(node.left);
    int rightHeight = height(node.right);
    return Math.max(leftHeight, rightHeight) + 1;
}
