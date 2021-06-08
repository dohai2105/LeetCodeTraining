public class No104 {
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

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int leftDeep = maxDepth(root.left);
        int rightDeep = maxDepth(root.right);

        return 1 + Math.max(leftDeep, rightDeep);
    }
}
