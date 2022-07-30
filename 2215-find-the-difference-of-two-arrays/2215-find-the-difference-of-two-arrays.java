class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         List<Integer>l1=new ArrayList<>();
         List<Integer>l2=new ArrayList<>();
                     List<Integer>l3=new ArrayList<>();
         List<Integer>l4=new ArrayList<>();
         List<List<Integer>>res=new ArrayList<>();
            
         for(int i=0;i<nums1.length;i++){
                 l1.add(nums1[i]);
         }   
          for(int i=0;i<nums2.length;i++){

                  l2.add(nums2[i]);
          }   
        for(int i=0;i<nums1.length;i++){
                 if(!l2.contains(nums1[i]) && !l3.contains(nums1[i]))l3.add(nums1[i]);
         }   
          for(int i=0;i<nums2.length;i++){

                  if(!l1.contains(nums2[i]) && !l4.contains(nums2[i])) l4.add(nums2[i]);
          }   
            
           
                 
      
            res.add(l3);
            res.add(l4);
            return res;
    }
}