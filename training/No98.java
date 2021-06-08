
// Definition for a binary tree node.
class No98 {

    public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
    public boolean isSymmetric(TreeNode root) {

        return compareLeftRight(root, root);
    }

    public boolean compareLeftRight(TreeNode left, TreeNode right) {

        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        return left.val == right.val && 
            compareLeftRight(left.left, right.right) &&
            compareLeftRight(left.right, right.left);
    }
}