package Lect48BST;

public class DeletionInBST {

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

            public TreeNode deleteNode(TreeNode root, int key) {

                if (root == null) {
                    return null;
                }

                if (root.val < key) {
                    root.right = deleteNode(root.right, key);
                } else if (root.val > key) {
                    root.left = deleteNode(root.left, key);
                } else {
                    //for 0 & 1 child
                    if (root.left == null) {
                        return root.right;
                    } else if (root.right == null) {
                        return root.left;
                    }
                    //for 2 child;
                    else {
                        
                    }
                }
                return root;
            }

            public int max(TreeNode root){
            if(root==null){
                return Integer.MIN_VALUE;
            }
            
            int rmax   = max(root.right);
            return Math.max(rmax,root.val);
            }

}
