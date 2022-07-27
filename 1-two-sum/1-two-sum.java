class Solution {
    public int[] twoSum(int[] nums, int target) {
            int ans[]=new int[2];
       HashMap<Integer,Integer>main=new HashMap<>();
            if(nums.length==2 && nums[0]==nums[1] && target==nums[0]+nums[1]){
                    ans[0]=0;
                    ans[1]=1;
                    return ans;
            }
        
          
           
            for(int i=0;i<nums.length;i++){
                     int sum=target-nums[i];
                                               if(main.containsKey(sum)){
                          ans[0]=main.get(sum);
                          ans[1]=i;
                       
                    }else{
                             main.put(nums[i],i);
                    }
            }
         return ans;
    }
}