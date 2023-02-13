package Lect47BinaryTree;

public class LCA_II {



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public TreeNode LCAII(TreeNode root,TreeNode p, TreeNode q){
        if((find(root.left, p) == false || find(root.right, q)) == false){
            return root;
        }
        return lowestCommonAncestor(root,p,q);
    }
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p, TreeNode q) {

        if(root==null){
            return null;
        }
        if(root==p || root==q){
            return root;
        }


        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right= lowestCommonAncestor(root.right,p,q);

        if(left!=null && right!=null){
            return  root;
        }
        if(left==null){
            return right;
        } else {
            return left;
        }
    }


    public boolean find(TreeNode root, TreeNode p){
        if(root==null){
            return false;
        }
        if(root==p){
            return true;
        }

        return find(root.left,p)||find(root.right,p);
    }




}

