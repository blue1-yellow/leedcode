class Solution {
    int maxlen=0;
    public int diameterOfBinaryTree(TreeNode root) {
        getmaxlen(root);
        return maxlen;
    }
    private int getmaxlen(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftlen=diameterOfBinaryTree(root.left);
        int rightlen=diameterOfBinaryTree(root.right);
        maxlen=Math.max(maxlen,leftlen+rightlen);
        return Math.max(leftlen,rightlen)+1;
    }
}
