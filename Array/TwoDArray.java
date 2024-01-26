package Array;

public class TwoDArray {
    public static int findTheLargest(int matrix[][]){
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<matrix.length;i++){
        for(int j=0; j<matrix.length;j++){
            if(matrix[i][j]>largest){
                largest = matrix[i][j];
            }
        }
    }
    return largest;
    }

    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
         int endRow = matrix.length-1;
          int endCol = matrix[0].length-1;

          while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol; j<=endCol;j++){
                System.out.print(matrix[startRow][j]);
            }
            //right
            for(int i = startRow+1; i<=endRow;i++){
                System.out.print(matrix[i][endCol]);
            }
            //bottom
            for(int j=endCol-1; j>=startCol;j--){
                if(startCol ==endCol){
                    break;
                }
                System.out.print(matrix[endRow][j]);
            }
            //left
            for(int i = endRow-1; i>=startRow+1;i--){
                if(startRow ==endRow){
                    break;
                }
                 System.out.print(matrix[i][startCol]);
            }
            startCol++;
            startRow++;
            endCol--;
           endRow--;
          }
         System.out.println();
    }

    public static void findDiagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix.length;i++){
            sum += matrix[i][i];
            if(i!= matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }

        }
        System.out.println(sum);

    }

    public static boolean searchInSortedMatrix(int matrix[][], int key){
        int row =0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found at "+ row + " "+col);
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int matrix [][] = {{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println(findTheLargest(matrix));
        // printSpiral(matrix);
        // findDiagonalSum(matrix);
        // searchInSortedMatrix(matrix, 8);
        String str = "Hello";
        str = "Hi";
        System.out.println(str);
    }
    
}
