class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left=0,right=0;
        char[] arr=s.toCharArray();
        int n=arr.length,maxlen=0;
        for(right=0;right<n;right++){
            while(set.contains(arr[right])){
                set.remove(arr[left]);
                left++;
            }
            set.add(arr[right]);
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}
