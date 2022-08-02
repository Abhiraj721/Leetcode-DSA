class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
            while(i>=0 && nums[i]>=nums[i+1])i--;
            int j=nums.length-1;
            if(i==-1){
                reverse(nums,0);
                    return;
            }
            if(i>=0)
            while(j>=0 && nums[i]>=nums[j])j--;
            swap(nums,i,j);
            reverse(nums,i+1);
    }
        public void swap(int []nums,int i,int j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
        }
        public void reverse(int [] nums,int start){
                int end=nums.length-1;
                while(start<end){
                        swap(nums,start,end);
                        start++;
                        end--;
                }
                        
        }
}