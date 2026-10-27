class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            int size=list.size();
            for(int j=0;j<size;j++){
            List<Integer> dp=new ArrayList<>(list.get(j));
            dp.add(nums[i]);
            list.add(dp);
            }
        }
        return list;
    }
}
