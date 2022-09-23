class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
            backtrack(res,new ArrayList<Integer>(),0,nums);
            return res;
    }
        public void backtrack(List<List<Integer>>res,List<Integer>subset,int index,int []nums){
                if(index==nums.length){
                        res.add(new ArrayList<>(subset));
                        return;
                }
                subset.add(nums[index]);
                backtrack(res,subset,index+1,nums);
                subset.remove(subset.size()-1);
                backtrack(res,subset,index+1,nums);
                return;
        }
}