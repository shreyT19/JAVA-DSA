package Lect49TreeQuestions;

public class ConstructBTfrom_PreorderandInorderTraversal {
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

        public TreeNode buildTree(int[] preorder, int[] inorder) {

        return Create(preorder,0,preorder.length-1,inorder,0, inorder.length-1);

        }
        public TreeNode Create(int[] preorder,int preLow,int preHigh,int []inorder,int inLow,int inHigh){

        if(preLow>preHigh || inLow>inHigh){
            return null;
        }



        TreeNode nn = new TreeNode(preorder[preLow]);
        int i = search(inorder,inLow,inHigh,preorder[preLow]);
        int netElement = i-inLow;
        nn.left= Create(preorder,preLow+1,preLow +netElement,inorder,inLow,i-1);
        nn.right=Create(preorder,preLow+netElement+1,preHigh,inorder,i+1,inHigh);
        return nn;
        }

        public int search(int[] order,int si,int ei,int item){
            for (int i = si; i <= ei; i++) {
                if(order[i]==item){
                    return i;
                }
            }
            return -1;
        }
}
