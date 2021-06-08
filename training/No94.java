public class No94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> result = new LinkedList<>();
        if (root == null) return result;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            
            TreeNode cur = stack.pop();
            if (cur.right != null) stack.push(cur.right);
            // only add to the result when left sub tree is null
            if (cur.left == null) result.add(cur.val);
            else {
                // if left sub tree is no null, we need to
                // add it back to the stack, but after its left sub tree.
                // then set the left subtree to null.(next time we can
                // add it)
                stack.push(cur);
                stack.push(cur.left);
                cur.left = null;
                cur.right = null;// we also need to cut the right subtree.
            }
            
        }
        
        return result;
    }
}
