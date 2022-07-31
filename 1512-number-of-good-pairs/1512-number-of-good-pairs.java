class Solution {
    public int numIdenticalPairs(int[] nums) {
        int [] count=new int [101];
            for(int i=0;i<nums.length;i++){
                    count[nums[i]]++;
            }
            int ans=0;
            for(int i:count){
                    if(i!=0)
                    ans+=(i*(i-1)/2);
            }
            return ans;
            
    }
}