class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<n;i++){
            int left=i+1,right=n-1;
           while(left<right){
         int total=nums[i]+nums[left]+nums[right];
         if(total==0){
            set.add(Arrays.asList(nums[i],nums[left],nums[right]));
            left++;
            right--;
         }
         else if(total<0){
            left++;
         }
         else{
            right--;
         }
        }
    }
        List<List<Integer>> list=new ArrayList<>(set);
        return list;
}
}
