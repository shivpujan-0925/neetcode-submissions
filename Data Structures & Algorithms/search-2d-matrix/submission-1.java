class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        //searching , top-right to bottom.

        // int row = 0;
        // int col = n-1;

        // while(row < m && col >= 0){
            
        //     if(matrix[row][col] == target){
        //         return true;
        //     }else if(matrix[row][col] < target){
        //         row++;
        //     }else{
        //         col--;
        //     }
        // }
        // return false;



        //searching , bottom-left to top

        int row = m-1;
        int col = 0;

        while(col < n && row >= 0){
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                col++;
            }else{
                row--;
            }
        }
        return false;
    }
}
