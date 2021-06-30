
// Definition for a binary tree node.

public class No98 {
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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;

        if(leftNode == null && rightNode == null) return true;

        int leftNodeVal = leftNode != null ? leftNode.val : Integer.MIN_VALUE;
        int rightNodeVal = rightNode != null ? rightNode.val : Integer.MAX_VALUE;

        boolean isValidBST = leftNodeVal < root.val && root.val < rightNodeVal ? true :  false;

        return isValidBST && isValidBST(leftNode) && isValidBST(rightNode);
    }
    
}
