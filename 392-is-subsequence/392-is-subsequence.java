class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
            if(s.length()==0)return true;
            while(i<t.length()){

                    if(t.charAt(i)==s.charAt(j)){
                            j++;
                    }
                     if(j==s.length())return true;
                    i++;
            }
            return false;
    }
}