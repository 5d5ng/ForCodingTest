package easy;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Maximum_Depth_of_Binary_Tree {

    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        if(root ==null) return 0;
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }

}
