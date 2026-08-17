class Solution {

    int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);

        int leftPath = 0;
        int rightPath = 0;

        // Check left child
        if (node.left != null && node.left.val == node.val) {
            leftPath = left + 1;
        }

        // Check right child
        if (node.right != null && node.right.val == node.val) {
            rightPath = right + 1;
        }

        // Path passing through current node
        max = Math.max(max, leftPath + rightPath);

        // Return longest downward path
        return Math.max(leftPath, rightPath);
    }
}
