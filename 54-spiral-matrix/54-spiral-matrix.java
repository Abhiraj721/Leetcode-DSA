class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
          int bottom=matrix.length-1;
            int right=matrix[0].length-1;
            int left=0;
            ArrayList<Integer>main=new ArrayList<>();
            int size=matrix.length*matrix[0].length;
            while(main.size()<size){
                    for(int i=left;i<=right && main.size()<size;i++){
                            main.add(matrix[top][i]);
                    }
                    top++;
                   for(int i=top;i<=bottom && main.size()<size;i++){
                           main.add(matrix[i][right]);
                   }
                   right--;
                    for(int i=right;i>=left && main.size()<size;i--){
                         main.add(matrix[bottom][i]); 
                    }
                    bottom--;
                    for(int i=bottom;i>=top && main.size()<size;i--){
                            main.add(matrix[i][left]);
                    }
                    left++;
                        
            }
            return main;
    }
}