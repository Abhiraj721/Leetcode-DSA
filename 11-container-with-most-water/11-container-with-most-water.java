class Solution {
    public int maxArea(int[] height) {
        int a_pointer=0;
        int b_pointer=height.length-1;
        int maxarea=0;
            while(a_pointer<b_pointer){
                    if(height[a_pointer]<height[b_pointer]){
                            maxarea=Math.max(maxarea,height[a_pointer]*(b_pointer-a_pointer));
                            a_pointer++;
                    }
                    else{
                    maxarea=Math.max(maxarea,height[b_pointer]*(b_pointer-a_pointer)); 
                            b_pointer--;
                    }
            }
            return maxarea;
            
    }
}