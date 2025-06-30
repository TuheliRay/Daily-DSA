
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
 
class MaxDepthBT {
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        int leftHeight=maxDepth(root.left);
        int rigthHeight=maxDepth(root.right);
        int myHeight=Math.max(leftHeight , rigthHeight)+1;
        return myHeight;
    }
}