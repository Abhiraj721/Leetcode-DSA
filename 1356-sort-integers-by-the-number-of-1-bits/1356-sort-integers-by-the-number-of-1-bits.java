class Solution {
    public int[] sortByBits(int[] arr) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                    int num=Integer.bitCount(arr[i]);
                    if(!map.containsKey(num))map.put(num,new ArrayList<>());
                    map.get(num).add(arr[i]);
            }
                int []ans=new int [arr.length];
                int index=0;
            for(List<Integer>temp:map.values()){
                    for(int i:temp){
                            ans[index++]=i;
                    }
            }
        return ans;
    }
}