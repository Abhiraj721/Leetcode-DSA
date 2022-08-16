class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int nearest=0;
        int nearest_index=-1;    
        int max_distance=Integer.MAX_VALUE;
        for(int i=0;i<points.length;i++){
             if(x==points[i][0]  || y==points[i][1]){
                     int distance=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
             
             if(max_distance > distance){
                     max_distance=distance;
                     nearest_index=i;
                     
             }
             }
                
        }
            return nearest_index;
    }
}