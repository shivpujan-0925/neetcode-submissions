class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //transpose
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse each row 
        for(int i = 0; i < n; i++){
            int row = 0;
            int col = n - 1;

            while(row < col){
                int temp = matrix[i][row];
                matrix[i][row] = matrix[i][col];
                matrix[i][col] = temp;

                row++;
                col--;
            }
        }
    }
}
