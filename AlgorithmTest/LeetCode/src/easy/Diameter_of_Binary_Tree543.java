package easy;

import com.sun.source.tree.Tree;

public class Diameter_of_Binary_Tree543 {
    public static void main(String[] args) {

    }

    static  int ans ;


    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1; //전역변수로 저장 최대값 비교를 위해1로 초기화
        depth(root);
        return ans - 1;
    }
    public int depth(TreeNode node) {
        if (node == null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L+R+1); //루트노드를 거치지않은 경우가 최대일 수도 있으므로 비교해준다.
        return Math.max(L, R) + 1;
    }




    public int diameterOfBinaryTree2(TreeNode root){
        if(root == null) return  0;
        int lheight = height(root.left);
        int rheight = height(root.right);

        int ldiameter = diameterOfBinaryTree2(root.left);
        int rdiameter = diameterOfBinaryTree2(root.right);

        return Math.max(lheight+rheight+1,Math.max(ldiameter,rdiameter));
    }

    public int height(TreeNode node) {
        if(node == null) return 0;
        int left = height(node.left);
        int right = height(node.right);

        return left>right ? 1+left : 1+right;
    }


}
