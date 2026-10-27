class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int maxnum=nums[0];
        int[] maxdp=new int[n];
        int[] mindp=new int[n];
        maxdp[0]=nums[0];
        mindp[0]=nums[0];
        for(int i=1;i<n;i++){
             maxdp[i]=Math.max(nums[i],Math.max(nums[i]*maxdp[i-1],nums[i]*mindp[i-1]));
             mindp[i]=Math.min(nums[i],Math.min(nums[i]*mindp[i-1],nums[i]*maxdp[i-1]));
             maxnum=Math.max(maxnum,maxdp[i]);
            }
        return maxnum;
    }
}
