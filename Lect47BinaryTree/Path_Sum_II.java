package Lect47BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Path_Sum_II {public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }
}

        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<Integer> list= new ArrayList<>();
            List<List<Integer>> l2 = new ArrayList<>();
            hasPathSum(root,targetSum,list,l2);
            return l2;

        }

        public void hasPathSum(TreeNode root, int targetSum,List<Integer> list,List<List<Integer>> l2) {
            if(root==null){
                return;
            }
            if(root.left==null && root.right==null && targetSum-root.val==0){
                list.add(root.val);
                l2.add(new ArrayList<>(list));
                list.remove(list.size()-1);
            }
            list.add(root.val);
            hasPathSum(root.left,targetSum-root.val,list,l2);
            list.remove(list.size()-1);
            list.add(root.val);
            hasPathSum(root.right,targetSum-root.val,list,l2);
            list.remove(list.size()-1);

        }
}
