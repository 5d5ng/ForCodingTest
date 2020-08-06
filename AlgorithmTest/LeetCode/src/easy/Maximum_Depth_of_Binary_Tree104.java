package easy;

public class Maximum_Depth_of_Binary_Tree104 {

    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        if(root ==null) return 0;
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }

}
