class Solution {
    public String longestPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            String n1=exand(s,i,i);
            String n2=exand(s,i,i+1);
            if(n1.length()>str.length()){
                str=n1;
            }
            if(n2.length()>str.length()){
                str=n2;
            }
        }
        return str;
    }
    public String exand(String s,int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}
