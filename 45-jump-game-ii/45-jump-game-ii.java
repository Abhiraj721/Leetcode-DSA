class Solution {
    public int jump(int[] nums) {
        int current_jump_max=0;
        int longest_jump_max=0;
        int steps=0;
            for(int i=0;i<nums.length-1;i++){
                    current_jump_max=Math.max(current_jump_max,nums[i]+i);
                    if(i==longest_jump_max){
                            steps++;
                            longest_jump_max=current_jump_max;
                    }
            }
            return steps;
    }
}