package Lect47BinaryTree;

public class SumRootToLeafNumbers {
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
    public int sumNumbers(TreeNode root) {

        return sum(root,0);


    }
    public int sum(TreeNode root,int n){
        if(root==null){
            return 0;
        }
        if(root.left==null &&root.right==null){
            return n*10+root.val;
        }

        int leftSum=sum(root.left,n*10+root.val);
        int rightSum=sum(root.right,n*10+root.val);

        return leftSum+ rightSum;
    }
}
