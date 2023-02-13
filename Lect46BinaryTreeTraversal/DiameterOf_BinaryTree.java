package Lect46BinaryTreeTraversal;

public class DiameterOf_BinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public int diameterOfBinaryTree(TreeNode root) {

            if (root == null) {
                return 0;
            }

            int leftDiameter = diameterOfBinaryTree(root.left);
            int rightDiameter = diameterOfBinaryTree(root.right);
            int selfDiameter = height(root.left) + height(root.right) + 2;

            return Math.max(Math.max(leftDiameter, rightDiameter), selfDiameter);
        }

        public int height(TreeNode root) {
            if (root == null) {
                return -1;
            }

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);


            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}