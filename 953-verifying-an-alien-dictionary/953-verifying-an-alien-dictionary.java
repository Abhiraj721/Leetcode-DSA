class Solution {
        int count[]=new int [26];
    public boolean isAlienSorted(String[] words, String order) {
            for(int i=1;i<order.length();i++){
                    count[order.charAt(i)-'a']=i;
            }
            for(int i=1;i<words.length;i++){
                    int a=compare(words[i-1],words[i]);
                    if(a>0)return false;;
            }
            return true;
    }
        public int compare(String word1,String word2){
                int i=0;
                int j=0;
                int compare_val=0;
                while(i<word1.length() && j<word2.length() && compare_val==0){
                        compare_val=count[word1.charAt(i)-'a']-count[word2.charAt(j)-'a'];
                        i++;
                        j++;
                        
                }
                if(compare_val==0){
                        return word1.length()-word2.length();
                }else {
                 return compare_val;
                }
        }

}