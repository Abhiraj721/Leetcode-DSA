class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
            List<List<Integer>>main=new ArrayList<>();       
            Arrays.sort(arr);
            for(int i=0;i<arr.length-2;i++){
                    if(i==0 ||(i>0 && arr[i]!=arr[i-1])){
                    int start=i+1;
                    int end=arr.length-1;
                    int sum=0-arr[i];
                    while(start<end){
                            int target=arr[start]+arr[end];
                            if(sum==target){
                         main.add(Arrays.asList(arr[start],arr[end],arr[i])) ;
                 while(start<end && arr[start]==arr[start+1]){
                         start++;
                 }
                                    while(start<end && arr[end]==arr[end-1]){
                                            end--;
                                    }
                                    start++;
                                    end--;
                            }
                            else if(target>sum){
                                    end--;
                            }else{
                                    start++;
                            }
                           
                    }
                    }
            }
   return main;
    }
}