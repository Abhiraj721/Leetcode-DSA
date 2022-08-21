class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
            helper(res,0,nums.length,nums);
            return res;
    }
        public void helper(List<List<Integer>>res,int pos,int n,int []nums){
                if(pos>=n){
                        List<Integer>sublist=Convert_to_ArrayList(nums);
                        res.add(sublist);
                        return ;
                }
                for(int i=pos;i<nums.length;i++){
                        swap(i,pos,nums);
                       helper(res,pos+1,n,nums);
                        swap(i,pos,nums);
                }
        }
        public List<Integer> Convert_to_ArrayList(int []nums){
                List<Integer>ans=new ArrayList<>();
                for(int i:nums){
                        ans.add(i);
                }
                return ans;
        }
        public void swap(int i,int j,int nums[]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                
        }
}