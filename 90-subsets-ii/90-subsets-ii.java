class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
            Arrays.sort(nums);
            backtrack(res,new ArrayList<>(),0,nums);
            return res;
    }
        public void backtrack( List<List<Integer>>res,List<Integer>subsets,int index,int []nums){
        
 res.add(new ArrayList<>(subsets));
        
                for(int i=index;i<nums.length;i++){
                         if(i>index && nums[i]==nums[i-1])continue;
                        subsets.add(nums[i]);
                        backtrack(res,subsets,i+1,nums);
                         subsets.remove(subsets.size()-1);
                        
                        
                }
        }
}