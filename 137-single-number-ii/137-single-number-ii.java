class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>main=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            main.put(nums[i],main.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(main.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }
}