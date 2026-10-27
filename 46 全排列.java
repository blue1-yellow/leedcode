class Solution {
    List<List<Integer>> list=new ArrayList<>();
    List<Integer> temp=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        boolean[] vis=new boolean[n];
        backtrack(n,nums,vis);
        return list;
    }
    public void backtrack(int n,int[] nums,boolean[] vis){
        if(temp.size()==n){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<n;i++){
            if(vis[i]){
                continue;
            }
            vis[i]=true;
            temp.add(nums[i]);
            backtrack(n,nums,vis);
            temp.remove(temp.size()-1);
            vis[i]=false;
        }
    }
}
