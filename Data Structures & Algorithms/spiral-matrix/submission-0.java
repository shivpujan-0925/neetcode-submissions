class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> spiralElement = new ArrayList<>(); 

        int m = matrix.length;
        int n = matrix[0].length;

        int startRow = 0;
        int startCol = 0;
        int endRow = m-1;
        int endCol = n-1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j = startCol; j <= endCol; j++){
                spiralElement.add(matrix[startRow][j]);
            }

            //right
            for(int i = startRow + 1; i <= endRow; i++){
              
                 spiralElement.add(matrix[i][endCol]);
            }
            //bottom
            for(int j = endCol -1; j >= startCol; j--){
                if(startRow == endRow){
                    break;
                }
                  spiralElement.add(matrix[endRow][j]);
            }

            //left
            for(int i = endRow - 1; i >= startRow + 1; i--){
                if(startCol == endCol){
                    break;
                }
                spiralElement.add(matrix[i][startCol]);
            }

        startRow++;
        startCol++;
        endRow--;
        endCol--;

        }
       return spiralElement;


    }
}
