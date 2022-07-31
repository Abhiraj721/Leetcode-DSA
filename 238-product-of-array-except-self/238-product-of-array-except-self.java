class Solution {
    public int[] productExceptSelf(int[] nums) {
            int product=1;
            int []ans=new int[nums.length];
            int index=0;
            for(int i=0;i<nums.length;i++){
                    if(nums[i]==0)index++;
                    product*=nums[i];
            }
            if(index==nums.length)return ans;
            for(int i=0;i<nums.length;i++){
                    if(nums[i]==0)ans[i]=helper(nums,i);
                    else ans[i]=product/nums[i];
            }
        return ans;
    }
        public int helper(int []nums,int ignore){
                int ans=1;
                int index=1;
                for(int i=0;i<nums.length;i++){
                         System.out.print(nums[i]);
                        if(i!=ignore){
                                ans*=nums[i];
                                index++;
                               
                        }
                }
                return ans;
        }
      
}