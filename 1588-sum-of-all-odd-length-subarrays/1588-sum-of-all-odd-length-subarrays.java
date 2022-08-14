class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
            ArrayList<Integer>temp=new ArrayList<>();
            int sum=0;
        for(int i=0;i<arr.length;i++){
                for(int j=i;j<arr.length;j++){
                        temp.add(arr[j]);
                        if(temp.size()%2>0){
                               sum+= sumoflist(temp);          
                        }
                }
                temp.clear();
        }
            return sum;
    }
        public int sumoflist(ArrayList<Integer>res){
                int sum1=0;
                for(int i:res){
                        sum1+=i;
                }
                return sum1;
        }
}