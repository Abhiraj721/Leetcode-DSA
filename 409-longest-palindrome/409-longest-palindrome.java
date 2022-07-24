class Solution {
    public int longestPalindrome(String s) {
        int [] char_count=new int[128];
            for(char c:s.toCharArray()){
                 char_count[c]++;
            }
            int result=0;
            for(int i=0;i<128;i++){
                    if(char_count[i]!=0){
                            result=result+char_count[i]/2*2;
                                    if(result%2==0 && char_count[i]%2==1) result++;
                    }
            }
            return result;
    }
}