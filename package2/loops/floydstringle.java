package package2.loops;

import java.util.Scanner;

public class floydstringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        int n=5;
        tringle(n);
    }
    public static void tringle(int n){
        // int temp;
        for(int i = 1; i <= n; i++){
            int temp=i  ;
            for(int j = 1; j <= i; j++){
                // temp=temp+1;
                // temp=temp+j;
                temp++;
                System.out.print(temp);
                
            }
            System.out.println();
        }
    }
}
