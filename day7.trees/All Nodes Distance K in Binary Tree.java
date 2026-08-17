class Solution {

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();

        // Store parent of every node
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        buildParentMap(root, null, parent);

        // BFS from target
        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        queue.offer(target);
        visited.add(target);

        int distance = 0;

        while (!queue.isEmpty()) {

            if (distance == k) {
                for (TreeNode node : queue) {
                    result.add(node.val);
                }
                return result;
            }

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                // Left child
                if (current.left != null && !visited.contains(current.left)) {
                    visited.add(current.left);
                    queue.offer(current.left);
                }

                // Right child
                if (current.right != null && !visited.contains(current.right)) {
                    visited.add(current.right);
                    queue.offer(current.right);
                }

                // Parent
                TreeNode p = parent.get(current);
                if (p != null && !visited.contains(p)) {
                    visited.add(p);
                    queue.offer(p);
                }
            }

            distance++;
        }

        return result;
    }

    private void buildParentMap(TreeNode node, TreeNode p,
                                 Map<TreeNode, TreeNode> parent) {
        if (node == null) {
            return;
        }

        parent.put(node, p);

        buildParentMap(node.left, node, parent);
        buildParentMap(node.right, node, parent);
    }
}
