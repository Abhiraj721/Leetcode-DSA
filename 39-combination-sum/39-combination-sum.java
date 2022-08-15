class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
            backtrack(res,0,new ArrayList<>(),target,0,candidates);
            return res;
    }
        public void backtrack  (List<List<Integer>>res,int currsum,List<Integer>subsets,int target,int index,int []candidates){
                if(index>=candidates.length || currsum>target)return;
                if(currsum==target){
                        res.add(new ArrayList<>(subsets));
                        return;
                }
                for(int i=index;i<candidates.length;i++){
                        subsets.add(candidates[i]);
                        backtrack(res,currsum+candidates[i],subsets,target,i,candidates);
                        subsets.remove(subsets.size()-1);
                }
        }
}