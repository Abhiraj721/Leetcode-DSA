class Solution {
        List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
            backtrack(candidates,target,0,new ArrayList<>(),0);
            return res;
        
    }
        public void backtrack(int [] candidates,int target,int currsum,  List<Integer>subset,int index){
                 if(index>=candidates.length || currsum>target){
                         return;
                 }
                if(currsum==target){
                        res.add(new ArrayList<>(subset));
                        return;
                }
                for(int i=index;i<candidates.length;i++){
                        subset.add(candidates[i]);
                        backtrack(candidates,target,currsum+candidates[i],subset,i);
                        subset.remove(subset.size()-1);
                
        }
        
        }
}