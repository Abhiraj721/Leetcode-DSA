class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>>res=new ArrayList<>();
            backtrack(res,0,new ArrayList<>(),nums);
            return res;
    }
        public void backtrack(List<List<Integer>>res,int index,List<Integer>subsets,int []nums){
                res.add(new ArrayList<>(subsets));
                for(int i=index;i<nums.length;i++){
                       subsets.add(nums[i]); //adding the current element to our subesets
                        backtrack(res,i+1,subsets,nums);
                        subsets.remove(subsets.size()-1);//removing the same element which we have added
                }
                return;
        }
}