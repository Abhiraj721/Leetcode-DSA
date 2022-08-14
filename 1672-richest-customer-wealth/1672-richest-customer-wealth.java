class Solution {
    public int maximumWealth(int[][] accounts) {
        int  sum=0;
            for(int []curr:accounts){
                    sum=Math.max(sum,helper(curr));
            }
            return sum;
    }
        public int helper(int []curr){
                int sum=0;
                for(int i:curr){
                        sum+=i;
                                
                }
                return sum;
        }
}