package package2.array;

import java.util.Scanner;

public class spiralmat {
    public static void spiral(int mat[][]){
        int sr=0;
        int sc=0;
        int er=mat.length-1;
        int ec=mat[0].length-1;
        while(sr<=er && sc<=ec){
            // Top row
            for(int j=sc;j<=ec;j++){
                System.out.print(mat[sr][j]+" ");
            }
            // Right Row
            for(int i=sr+1;i<=er;i++){
                System.out.print(mat[i][ec]+" ");
            }
            // Bottom Row
            for(int j=ec-1;j>=sc;j--){
                System.out.print(mat[er][j]+" ");
            }
            for(int i=er-1;i>=sr+1;i--){
                System.out.print(mat[i][sc]+" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of rows");
        int m=sc.nextInt();
        System.out.println("Enter no of columns");
        int n=sc.nextInt();
        int mat[][]= new int [m][n];
        // Input for matrix element
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        // int mat[][]={{1,2,3,8},{4,5,6,9}, {7,8,9,5}, {11,12,13,14}};
        spiral(mat);
    }
}
