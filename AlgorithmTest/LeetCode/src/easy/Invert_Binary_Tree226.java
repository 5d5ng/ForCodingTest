package easy;

public class Invert_Binary_Tree226 {
    public static void main(String[] args) {

    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        else{
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;


    }
}
