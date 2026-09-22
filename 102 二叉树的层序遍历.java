class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> arr=new ArrayList<>();
            int curqueuesize=queue.size();
            for(int i=0;i<curqueuesize;i++){
                TreeNode curnode=queue.poll();
                if(curnode.left!=null){
                    queue.offer(curnode.left);
                }
                if(curnode.right!=null){
                    queue.offer(curnode.right);
                }
                arr.add(curnode.val);
            }
            list.add(arr);
        }
        return list;
    }
}
