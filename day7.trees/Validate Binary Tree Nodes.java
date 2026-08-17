class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {

        // Find the parent of every node
        int[] parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = -1;
        }

        // Check that every child has only one parent
        for (int i = 0; i < n; i++) {

            if (leftChild[i] != -1) {
                if (parent[leftChild[i]] != -1) {
                    return false; // Multiple parents
                }
                parent[leftChild[i]] = i;
            }

            if (rightChild[i] != -1) {
                if (parent[rightChild[i]] != -1) {
                    return false; // Multiple parents
                }
                parent[rightChild[i]] = i;
            }
        }

        // Find the root
        int root = -1;

        for (int i = 0; i < n; i++) {
            if (parent[i] == -1) {
                if (root != -1) {
                    return false; // More than one root
                }
                root = i;
            }
        }

        // No root
        if (root == -1) {
            return false;
        }

        // Check connectivity and cycles using BFS
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(root);
        visited[root] = true;

        int count = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            count++;

            int left = leftChild[node];
            int right = rightChild[node];

            if (left != -1) {
                if (visited[left]) {
                    return false;
                }

                visited[left] = true;
                queue.offer(left);
            }

            if (right != -1) {
                if (visited[right]) {
                    return false;
                }

                visited[right] = true;
                queue.offer(right);
            }
        }

        // All nodes must be connected
        return count == n;
    }
}
