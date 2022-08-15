class Solution {
    public int[][] construct2DArray(int[] arr, int m, int n) {
        if(arr.length!=m*n)return new int [0][0];
            int [][]res=new int[m][n];
            int index=0;
            for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                            res[i][j]=arr[index++];
                    }
            }
            return res;
            
            
    }
}