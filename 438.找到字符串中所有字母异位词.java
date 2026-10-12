class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int lens=s.length(),lenp=p.length();
        List<Integer> list=new ArrayList<>();
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        if(lens<lenp){
            return list;
        }
        for(int i=0;i<lenp;i++){
            arr1[s.charAt(i)-'a']++;
            arr2[p.charAt(i)-'a']++;
        }
        if(equals(arr1,arr2)){
            list.add(0);
        }
        for(int i=lenp;i<lens;i++){
            arr1[s.charAt(i-lenp)-'a']--;
            arr1[s.charAt(i)-'a']++;
            if(equals(arr1,arr2)){
                list.add(i-lenp+1);
            }
        }
        return list;
    }
    public boolean equals(int arr1[],int arr2[]){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
