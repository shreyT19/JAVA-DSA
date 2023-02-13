package Lect49TreeQuestions;

public class ValidateBinarySearchTree {
    public class TreeNode {
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
    public class BSTpair{
        boolean isBST = true;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

    }
    public boolean isValidBST(TreeNode root) {
        return validBST(root).isBST;

    }
    public BSTpair validBST(TreeNode root){
        if(root==null){
            return new BSTpair();
        }

        BSTpair leftBST= validBST(root.left);
        BSTpair rightBST= validBST(root.right);
        BSTpair selfBST = new BSTpair();
        if(leftBST.isBST=true && rightBST.isBST==true && leftBST.max<root.val && rightBST.min>root.val){
            selfBST.isBST = true;
            selfBST.max= Math.max(rightBST.max,root.val);
            selfBST.min= Math.min(leftBST.min,root.val);
            return selfBST;
        }

        selfBST.isBST = false;
        selfBST.max= Math.max(rightBST.max ,Math.max(root.val,leftBST.max));
        selfBST.min= Math.min(rightBST.min , Math.min(root.val,leftBST.min));
        return selfBST;
    }

}
