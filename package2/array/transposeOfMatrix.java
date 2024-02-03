package package2.array;

public class transposeOfMatrix {
    int mat[][]={{1,2,3},{4,5,6}};
    // int transpose[][]= new int[3][2];
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat.length;j++){
            int transpose[j][i]= mat[i][j];
        }
    }
}
