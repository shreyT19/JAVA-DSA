package TreeImportantQuestions;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree_LevelOrder_Leetcode {



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


        public List<List<Integer>> levelOrder(TreeNode root) {

            List<List<Integer>> list = new ArrayList<>();
            List<Integer> list1 = new ArrayList<>();
            LevelOrder(root,list,list1);

            return list;

        }
        public void LevelOrder(TreeNode root,List<List<Integer>> list, List<Integer> list1 ){

            Queue<TreeNode> qq = new LinkedList<>();
            Queue<TreeNode> helperQ = new LinkedList<>();

            qq.add(root);

            if(root==null){
                return;
            }

            while(!qq.isEmpty()){


                TreeNode rv = qq.remove();
                list1.add(rv.val);

                if(rv.left!=null){
                    helperQ.add(rv.left);
                }

                if(rv.right!=null){
                    helperQ.add(rv.right);
                }
                if(qq.isEmpty()){
                    qq= helperQ;
                    list.add(new ArrayList<>(list1));
                    list1 = new ArrayList<>();

                    helperQ= new LinkedList<>();
                }


            }


        }

}
