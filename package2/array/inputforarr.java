package package2.array;

import java.util.Scanner;
public class inputforarr {
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

        // Printing matrix
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        // Printing largest element
        //  System.out.println("Largest element................");
        int max=mat[0][0];
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                while(max<mat[i][j]){
                    max=mat[i][j];
                }
            }
        }
        System.out.println("Largest element is: "+max);
        //Smallest element 
        int min=mat[0][0];
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                while(min>mat[i][j]){
                    min=mat[i][j];
                }
            }
        }
        System.out.println("Smallest element is: "+min);
    }
}
