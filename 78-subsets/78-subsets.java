class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
            generatesubsets(nums,res,0,new ArrayList<>());
            return res;
    }
        public void generatesubsets(int []nums,List<List<Integer>>res,int index,List<Integer>current){
                res.add(new ArrayList<>(current));
                for(int i=index;i<nums.length;i++){
                        current.add(nums[i]);
                        generatesubsets(nums,res,i+1,current);
                        current.remove(current.size()-1);
                }
        }
}


