class Solution {
    public int strStr(String haystack, String needle) {
        if(needle==null){
                return 0;
        }else if(needle.length()==0 || haystack.length()==0)return -1;
            else if(needle.length()>haystack.length())return -1;
            for(int i=0;i<haystack.length()+1-needle.length();i++){
                   if(haystack.charAt(i)==needle.charAt(0)){
                           if(haystack.substring(i,i+needle.length()).equals(needle))return i;
                   } 
            }
            return -1;
    }
}