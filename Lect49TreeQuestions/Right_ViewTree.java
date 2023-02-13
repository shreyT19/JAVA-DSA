package Lect49TreeQuestions;

import java.util.ArrayList;
import java.util.List;

public class Right_ViewTree {
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


        static int maxDepth;
        public List<Integer> rightSideView(TreeNode root) {
            maxDepth=-1;
            List<Integer> ll= new ArrayList<>();

            rightSide(root,ll,0);
            return ll;
        }
        public void rightSide(TreeNode root, List<Integer> ll, int curr){

            if(root==null){
                return;
            }
            if(curr>maxDepth){
                ll.add(root.val);
                maxDepth=curr;
            }
            rightSide(root.right,ll,curr+1);
            rightSide(root.left,ll,curr+1);
        }
    }
}
