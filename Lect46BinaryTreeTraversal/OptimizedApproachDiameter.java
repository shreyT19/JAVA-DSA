package Lect46BinaryTreeTraversal;

public class OptimizedApproachDiameter {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        public class DiaPair{
            int diameter=0;
            int height=-1;
        }
        class Solution {
            public int diameterOfBinaryTree(TreeNode root) {

                return diameter(root).diameter;

            }
            public DiaPair diameter(TreeNode root){
                if(root==null){
                    return new DiaPair();
                }
                DiaPair leftDP= diameter(root.left);
                DiaPair rightDP =diameter(root.right);

                DiaPair sdp = new DiaPair();
                sdp.height=Math.max(leftDP.height,rightDP.height)+1;
                int dia= leftDP.height+ rightDP.height+2;
                sdp.diameter= Math.max(dia,Math.max(leftDP.diameter, rightDP.diameter));
                return sdp;
            }


        }
    }
}