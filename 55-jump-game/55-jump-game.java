class Solution {
    public boolean canJump(int[] nums) {
        int last_valid_index=nums.length-1;
            for(int i=nums.length-1;i>=0;i--){
                    if(i+nums[i]>=last_valid_index){
                            last_valid_index=i;
                    }
            }
            if(last_valid_index==0)return true;
            return false;
    }
}