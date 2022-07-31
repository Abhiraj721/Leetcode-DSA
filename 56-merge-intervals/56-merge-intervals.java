class Solution {
    public int[][] merge(int[][] intervals) {
                 Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        if(intervals.length<1) return intervals;
        Stack<int []>stack=new Stack<>();
         stack.push(intervals[0]);
           for(int i=1;i<intervals.length;i++){
                 
                   int []pre=stack.peek();
                   int [] curr=intervals[i];
                   if(pre[1]<curr[0]){
                           stack.add(curr);
                   }else{
                           pre[1]=Math.max(curr[1],pre[1]);
                   }
           }
            return stack.toArray(new int[stack.size()][2]);
    }
}