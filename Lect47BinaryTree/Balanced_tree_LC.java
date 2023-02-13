package Lect47BinaryTree;

public class Balanced_tree_LC {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }
    }

    public class BalancedPair{
        boolean isBalanced=true;    //balancingfactor
        int ht=-1;
    }
    public boolean isBalanced(TreeNode root) {


            return isBalancedPair(root).isBalanced;
    }
    public BalancedPair isBalancedPair(TreeNode root){
        if(root ==null){
            return new BalancedPair();
        }
        BalancedPair leftBP= isBalancedPair(root.left);
        BalancedPair rightBP= isBalancedPair(root.right);
        BalancedPair sbp = new BalancedPair();
        sbp.ht=Math.max(leftBP.ht, rightBP.ht)+1;
        int bf= Math.abs(leftBP.ht- rightBP.ht);

        sbp.isBalanced= leftBP.isBalanced && rightBP.isBalanced && bf<=1;
        return sbp;
    }


}
