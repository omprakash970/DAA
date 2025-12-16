public class matrix_multiplication{
    public static void main(String[] args){
        int[][] matrixA={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int [][] matrixB={
            {9,8,7},
            {6,5,4},
            {3,2,1}
        };
        int[][] result = new int[3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                 
                for(int k=0;k<3;k++){
                     result[i][j]+= matrixA[i][k]*matrixB[k][j];
                }
            }

        }
        
    }

}