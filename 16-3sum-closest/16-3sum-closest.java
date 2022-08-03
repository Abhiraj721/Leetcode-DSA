class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int close=Integer.MAX_VALUE;
            Arrays.sort(nums);
            for(int i=0;i<nums.length-2;i++){
                    int start=i+1;
                    int end=nums.length-1;
                    while(start<end){
                          int curr_sum=nums[i]+nums[start]+nums[end];

                         
                            if(start<end && curr_sum<target){
                                   start++;
                            }else{
                                   end--;
                            }
                            if(Math.abs(curr_sum-target)<Math.abs(close-target)){
                                    close=curr_sum;
                            }
                    }
            }
            return close;
    }
}