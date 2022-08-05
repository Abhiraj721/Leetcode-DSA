class Solution {
    public int subarraysDivByK(int[] nums, int k) {
                     HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
            int temp;
            int res=0;
            map.put(0,1);
            for(int i=0;i<nums.length;i++){
                    sum+=nums[i];
                    temp=sum%k;
                    if(temp<0)temp+=k;
                    if(map.containsKey(temp)){
                            res+=map.get(temp);            
                    }
                    map.put(temp,map.getOrDefault(temp,0)+1);
                                             

                    
            }
            return res;
    }
}