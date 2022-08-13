class Solution {
                        int ans_index=0;
        
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []ans=new int[nums1.length];
            int index=0;
        for(int i=0;i<nums1.length;i++){
                for(int j=0;j<nums2.length;j++){
                        if(nums1[i]==nums2[j]){
                                helper(nums1,nums2,j,i,ans);
                        }
                }
        }
                   
            return ans;
    }
        public void helper(int []nums1,int []nums2,int index2,int index1,int []ans){
                for(int i=index2+1;i<nums2.length;i++){
                        if(nums2[index2]<nums2[i]){
                                ans[ans_index]=nums2[i];
                                break;
                        }
                }
                if(ans[ans_index]==0)ans[ans_index]=-1;
                ans_index++;
        }
}