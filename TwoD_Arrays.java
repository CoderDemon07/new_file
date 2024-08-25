import java.util.*;
public class TwoD_Arrays {

    public static void search(int matrix[] [], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell (" + i + "," + j + ")");
                }
            }
        }
        System.out.println("Key not found");
    }

    public static void SpiralBox(int matrix[] []){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                //if there is only a single row
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                //if there is only a single column
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static int diagonalSum(int matrix[][]){
    int sum = 0;
    // //diagonal sum by two loops. Time Complexity - n^2
    // //     for(int i=0;i<matrix.length;i++){
    // //         for(int j=0; j<matrix[0].length; j++){
    // //             if(i==j){
    // //                 sum += matrix[i][j];
    // //             }
    // //             else if(i+j == matrix.length-1){
    // //                 sum += matrix[i][j];
    // //             }
    // //         }
    // //     }

    //     //By one loop method, time compexcity - n
    //     for(int i=0; i<matrix.length; i++){
    //         sum+=matrix[i][i];//primary diagonal
    //         int j = matrix.length-1-i;
    //         if(i != j){//value of j will be j-i-1
    //             sum += matrix[i][j]; //secondary diagonal
    //         }
    //     }
         return sum;
    } 

    // public static void sortingMatrix(int matrix[][]){
    //     for(int i=0; i<matrix.length-1; i++){
    //         for(int j=0; j<matrix[0].length-1; j++){
    //             if(matrix[i][j]>matrix[i][j+1]){
    //                 int temp = matrix[i][j+1];
    //                 matrix[i][j+1] = matrix[i][j];
    //                 matrix[i][j] = temp;
    //             }
    //         }
    //     }
    // }
 
    public static boolean StaircaseSearch(int matrix[][], int key){
        // int row = 0, col = matrix[0].length-1;

        // while(row < matrix.length && col>=0){
        //     if(key == matrix[row][col]){
        //         System.out.println("found key at (" + row + "," + col + ")" );
        //         return true;
        //     }
        //     else if(key < matrix[row][col]){
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }
        // System.out.println("Key not found!");
        // return false;

        //from bottom reverse search
        int i = matrix.length-1;int j = 0;
        while(i >=0 && j<matrix.length){
            if(key == matrix[i][j]){
                        System.out.println("found key at (" + i + "," + j + ")" );
                        return true;
                    }
                    else if(key < matrix[i][j]){
                        i--;
                    }
                    else{
                        j++;
                    }
                }
                System.out.println("Key not found!");
                return false;

        }

    public static void printMatrix(int matrix[][]){
        for(int i=0; i<=matrix.length-1; i++){
            for(int j=0; j<=matrix[0].length-1; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // int matrix[] [] = new int[3][3];
        // int n = matrix.length, m = matrix[0].length;
        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<3; i++){
        //     for(int j=0; j<3; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        //output
        // for(int i=0; i<3; i++){
        //     for(int j=0; j<3; j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // search(matrix, 9);

        int matrix[][] = {{1,2,3,4},
                          {7,6,5,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        //  SpiralBox(matrix);
        // System.out.println(diagonalSum(matrix));
        // sortingMatrix(matrix);
        printMatrix(matrix);
        int key = 15;
        StaircaseSearch(matrix, key);
        


    }
}
