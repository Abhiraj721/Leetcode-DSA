class Solution {
    public boolean isPalindrome(String s) {
       boolean ans= helper(0,s.length()-1,s);
            return ans;
    }
        public boolean helper(int start,int end,String s){
                if(start>=end)return true;
                while(!Character.isLetterOrDigit(s.charAt(start)) && start<end)start++;
                 while(!Character.isLetterOrDigit(s.charAt(end)) && start<end)end--;
                if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))) {
                       return false; 
               }

             return   helper(start+1,end-1,s);
                 
        }
}