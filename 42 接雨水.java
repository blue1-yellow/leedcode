class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int total=0;
        int left=0,right=n-1;
        int leftmax=0,rightmax=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]<leftmax){
                    total+=leftmax-height[left];
                }
                else{
                    leftmax=height[left];
                }
                left++;
            }
            else{
                    if(height[right]<rightmax){
                        total+=rightmax-height[right];
                    }
                    else{
                     rightmax=height[right];
                    }
                    right--;
            }
        }
    return total;
    }
}
