public class leedcode {
    class Solution {
        public int longestConsecutive(int[] nums) {
            Set<Integer> set=new HashSet<>();
            int maxlen=0;
            for(Integer num:nums){
                set.add(num);
            }
            for(Integer num:set){
                if(!set.contains(num-1)){
                    int curlen=1;
                    int curnum=num;
                    while(set.contains(curnum+1)){
                        curlen++;
                        curnum++;
                    }
                    maxlen=Math.max(maxlen,curlen);
                }
            }
            return maxlen;
        }
    }
}
