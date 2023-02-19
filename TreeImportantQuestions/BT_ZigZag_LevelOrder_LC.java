package TreeImportantQuestions;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class BT_ZigZag_LevelOrder_LC {

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

        static int level;

        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

            List<List<Integer>> list = new ArrayList<>();
            List<Integer> list1 = new ArrayList<>();
            levelOrder(root, list, list1);
            return list;

        }

        public void levelOrder(TreeNode root, List<List<Integer>> list, List<Integer> list1) {
            level = 0;
            Queue<TreeNode> qq = new LinkedList<>();
            Queue<TreeNode> helperQ = new LinkedList<>();

            if (root == null) {
                return;
            }
            qq.add(root);
            while (!qq.isEmpty()) {

                TreeNode rv = qq.remove();
                list1.add(rv.val);

                if (rv.left != null) {
                    helperQ.add(rv.left);
                }
                if (rv.right != null) {
                    helperQ.add(rv.right);
                }

                if (qq.isEmpty()) {
                    qq = helperQ;


                    helperQ = new LinkedList<>();

                    if (level % 2 == 1) {

                        Collections.reverse(list1);
                    }
                    list.add(new ArrayList<>(list1));
                    list1 = new ArrayList<>();
                    level++;
                }
            }
        }

    }

