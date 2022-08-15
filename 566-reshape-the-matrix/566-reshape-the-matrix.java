class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat.length*mat[0].length)return mat;
        int [][]res=new int[r][c];
        int rows=mat.length;
        int col=mat[0].length;
        int res_rows=0;
        int res_col=0;
        for(int i=0;i<rows;i++){
                for(int j=0;j<col;j++){
                        res[res_rows][res_col]=mat[i][j];
                        res_col++;
                        if(res_col==c){
                                res_col=0;
                                res_rows++;
                        }
                }
        }
            return res;
            
            
    }
}