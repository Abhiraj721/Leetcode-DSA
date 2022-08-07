class Solution {
    public int maxScore(int[] nums, int k) {
        int left_product[]=new int [k+1];
        int right_product[]=new int [k+1];
            left_product[0]=0;
            right_product[0]=0;
            int sum=0;
            int index_1=1;
            for(int i=0;i<k;i++){
                   sum+=nums[i];
                    left_product[index_1++]=sum;
            }
            int index=1;
            sum=0;
            for(int i=nums.length-1;i>=nums.length-k;i--){
                    sum+=nums[i];
                    right_product[index++]=sum;
            }
            int end=left_product.length-1;
            int max_sum=0;
            for(int i=0;i<left_product.length;i++){
                    max_sum=Math.max(max_sum,left_product[i]+right_product[end--]);
            }
                    return max_sum;
           
    }
}