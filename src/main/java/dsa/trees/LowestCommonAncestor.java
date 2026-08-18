package dsa.trees;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        /*
         * Constructing the Tree:
         *
         *               [ 3 ]
         *              /     \
         *          [ 5 ]     [ 1 ]
         *         /     \
         *     [ 6 ]     [ 2 ]
         *               /   \
         *             [7]   [4]
         */

        TreeNode root = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node6 = new TreeNode(6);
        TreeNode node2 = new TreeNode(2);
        TreeNode node7 = new TreeNode(7);
        TreeNode node4 = new TreeNode(4);

        // Connections (Edges)
        root.left = node5;
        root.right = node1;

        node5.left = node6;
        node5.right = node2;

        node2.left = node7;
        node2.right = node4;

        System.out.println("==========================================");
        System.out.println("🌳 Tree Created Successfully!");
        System.out.println("==========================================");

        // -----------------------------------------------------------
        // TEST CASE 1: LCA of Node 6 (Mgr-A) and Node 2 (Mgr-B)
        // Expected Output: Node 5 (VP)
        // -----------------------------------------------------------
        TreeNode p1 = node6;
        TreeNode q1 = node2;

        TreeNode lca1 = lowestCommonAncestor(root, p1, q1);
        System.out.println("Test Case 1:");
        System.out.println("Find LCA of " + p1.val + " and " + q1.val);
        System.out.println("👉 Result: " + (lca1 != null ? lca1.val : "null"));
        System.out.println("Expected: 5\n");

        // -----------------------------------------------------------
        // TEST CASE 2: LCA of Node 6 and Node 4
        // Expected Output: Node 5
        // -----------------------------------------------------------
        TreeNode p2 = node6;
        TreeNode q2 = node4;

        TreeNode lca2 = lowestCommonAncestor(root, p2, q2);
        System.out.println("Test Case 2:");
        System.out.println("Find LCA of " + p2.val + " and " + q2.val);
        System.out.println("👉 Result: " + (lca2 != null ? lca2.val : "null"));
        System.out.println("Expected: 5\n");

        // -----------------------------------------------------------
        // TEST CASE 3: LCA of Node 5 and Node 4 (Ancestor relation)
        // Expected Output: Node 5
        // -----------------------------------------------------------
        TreeNode p3 = node5;
        TreeNode q3 = node4;

        TreeNode lca3 = lowestCommonAncestor(root, p3, q3);
        System.out.println("Test Case 3:");
        System.out.println("Find LCA of " + p3.val + " and " + q3.val);
        System.out.println("👉 Result: " + (lca3 != null ? lca3.val : "null"));
        System.out.println("Expected: 5");
        System.out.println("==========================================");

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || root ==p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null)
            return root;

        return (left != null) ? left : right;
    }
}
