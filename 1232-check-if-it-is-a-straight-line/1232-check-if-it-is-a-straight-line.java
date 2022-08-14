class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x_diff=coordinates[1][0]-coordinates[0][0];
        int y_diff=coordinates[1][1]-coordinates[0][1];
        for(int i=2;i<coordinates.length;i++){
                int curr_x_diff=coordinates[i][0]-coordinates[i-1][0];
                int curr_y_diff=coordinates[i][1]-coordinates[i-1][1];
                if(curr_x_diff*y_diff!=curr_y_diff*x_diff)return false;
        }
            return true;
            
    }
}